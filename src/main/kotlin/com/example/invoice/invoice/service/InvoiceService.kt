package com.example.invoice.invoice.service

import com.example.invoice.invoice.model.Invoice
import com.example.invoice.invoice.repository.InvoiceRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class InvoiceService {
    @Autowired
    lateinit var invoiceRepository: InvoiceRepository

    fun list ():List<Invoice>{
        return invoiceRepository.findAll()
    }

    fun save(invoice: Invoice): Invoice{
        try{
            return invoiceRepository.save(invoice)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }

    /*Primer paso: creamos una funcion que llama al filterTotal creado por nosotros*/
    fun filterTotal (value :Double?) : List<Invoice>? {
        return invoiceRepository.filterTotal(value)
    }

}