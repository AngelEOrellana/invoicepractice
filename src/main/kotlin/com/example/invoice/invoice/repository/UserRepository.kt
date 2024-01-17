package com.example.invoice.invoice.repository

import com.example.invoice.invoice.model.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<UserEntity, String> {

    fun findByUsername(username: String): UserEntity?

}