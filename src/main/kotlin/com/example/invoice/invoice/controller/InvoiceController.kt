package com.example.invoice.invoice.controller

import com.example.invoice.invoice.model.Invoice
import com.example.invoice.invoice.service.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/invoice")   //endpoint
class InvoiceController {
    @Autowired  //anotation. busca al objeto ya creado en el contexto.
    lateinit var invoiceService: InvoiceService

    @GetMapping
    fun list ():List <Invoice>{
        return invoiceService.list()
    }

    @PostMapping
    fun save (@RequestBody invoice: Invoice):ResponseEntity<Invoice>{
        return ResponseEntity(invoiceService.save(invoice), HttpStatus.OK)
    }

    @GetMapping("/filter-total/{value}")
    fun listFilterTotal(@PathVariable("value") value:Double):ResponseEntity<*>{
        return  ResponseEntity(invoiceService.filterTotal(value),HttpStatus.OK)
    }
}