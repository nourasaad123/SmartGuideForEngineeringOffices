package com.example.segoupdated.domain.entity

data class Contact(
    val id: Int,
    val companyId:Int,
    val email: String,
    val phoneNumber: String,
    val address: String
)
