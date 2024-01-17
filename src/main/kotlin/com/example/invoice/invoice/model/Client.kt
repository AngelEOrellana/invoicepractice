package com.example.invoice.invoice.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "client")
class Client {
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Id
   @Column(updatable = false)
    var id: Long? = null
    var fullname: String? = null
    var address: String? = null
    var email: String? = null
}