package com.example.invoice.invoice.repository

import com.example.invoice.invoice.model.Detail
import com.example.invoice.invoice.model.Invoice
import com.example.invoice.invoice.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DetailRepository : JpaRepository<Detail, Long?> {
    fun findById (id: Long?): Detail?

}