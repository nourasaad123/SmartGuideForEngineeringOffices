package com.example.segoupdated.domain.entity

data class Company(
    val id: Int,
    val email: String,
    val password: Int,
    val logo: String?,
    val name: String,
    val address: String,
    val specialization: String,
    val overView: String,
    )
