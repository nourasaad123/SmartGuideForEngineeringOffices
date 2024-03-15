package com.example.segoupdated.domain.entity

data class User(
    val id: Int,
    val image: String?,
    val name: String,
    val country: String,
    val email: String,
    val password: Int,
    val phoneNumber: String,
)
