package com.example.invoice.invoice.controller

import com.example.invoice.invoice.model.Detail
import com.example.invoice.invoice.model.Product
import com.example.invoice.invoice.service.DetailService
import com.example.invoice.invoice.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/detail")   //endpoint
class DetailController {
    @Autowired  //anotation. busca al objeto ya creado en el contexto.
    lateinit var detailService: DetailService

    @GetMapping
    fun list ():List <Detail>{
        return detailService.list()
    }

    @PostMapping
    fun save (@RequestBody detail: Detail): ResponseEntity<Detail> {
        return ResponseEntity(detailService.save(detail), HttpStatus.OK)
    }
}