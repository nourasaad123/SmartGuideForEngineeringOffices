package com.example.segoupdated.data.remote.model.dto

data class UserSignUpRequestDto(
    val name: String,
    val email: String,
    val password: String,
    val phone: String,
    val country: String = "",
    val image: String
)

