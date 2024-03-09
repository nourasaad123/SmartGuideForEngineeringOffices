package com.example.segoupdated.domain.entity

data class LoginResponse(
    val auth:Authorization,
    val user: Any,//user or company
    val status: String,

    )
