package com.example.invoice.invoice.repository

import com.example.invoice.invoice.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository: JpaRepository<Client, Long?> {
        fun findById (id:Long?): Client?
}