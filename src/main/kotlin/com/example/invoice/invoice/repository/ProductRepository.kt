package com.example.invoice.invoice.repository

import com.example.invoice.invoice.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : JpaRepository<Product, Long?> {

    fun findById (id: Long?): Product?
    /*Segundo paso: creamos la funcion filterTotal aqui:*/

}