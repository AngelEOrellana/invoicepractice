package com.example.invoice.invoice.controller

import com.example.invoice.invoice.model.Product
import com.example.invoice.invoice.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")   //endpoint
class ProductController {
    @Autowired  //anotation. busca al objeto ya creado en el contexto.
    lateinit var productService: ProductService

    @GetMapping
    fun list ():List <Product>{
        return productService.list()
    }

    @PostMapping
    fun save (@RequestBody product: Product):ResponseEntity<Product> {
        return ResponseEntity(productService.save(product), HttpStatus.OK)
    }
}