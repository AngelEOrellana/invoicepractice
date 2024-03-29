package com.example.invoice.invoice.model

import jakarta.persistence.*

@Entity
@Table(name = "detail")
class Detail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var quantity: Double? = null
    var price: Double? = null
    var invoice_id: Long? = null
    var product_id: Long? = null

}