package com.example.invoice.invoice.controller

import com.example.invoice.invoice.model.Client
import com.example.invoice.invoice.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/client")   //endpoint
class ClientController {

    @Autowired  //anotation. busca al objeto ya creado en el contexto.
    lateinit var clientService: ClientService

    @GetMapping
    fun list ():List <Client>{
        return clientService.list()
    }

    @PostMapping
    fun save (@RequestBody client: Client): ResponseEntity<Client> {
        return ResponseEntity(clientService.save(client), HttpStatus.OK)
    }

    /*@GetMapping
    fun list (model:Client, pageable: Pageable):ResponseEntity<*>{
        val response= clientService.list(pageable,model)
        return ResponseEntity(response, HttpStatus.OK)
    }*/
}