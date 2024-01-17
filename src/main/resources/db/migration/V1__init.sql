
CREATE TABLE IF NOT EXISTS client(
    id SERIAL,
    fullname VARCHAR(50),
    address VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS invoice(
    id SERIAL,
    create_at DATE,
    total DECIMAL(10,2),
    client_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY(client_id) REFERENCES client(id)
);

CREATE TABLE IF NOT EXISTS product(
    id SERIAL,
    description VARCHAR(50),
    brand VARCHAR(50),
    price DECIMAL(10,2),
    stock DECIMAL(10,2),
    PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS detail(
    id SERIAL,
    quantity DECIMAL(10,2),
    price DECIMAL(10,2),
    invoice_id INT,
    product_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY(invoice_id) REFERENCES invoice(id),
    FOREIGN KEY(product_id) REFERENCES product(id)
);

CREATE VIEW invoice_view AS
    select invoice.*, client.fullname
    from invoice
    inner join client ON client.id = invoice.client_id;