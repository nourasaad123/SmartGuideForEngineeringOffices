package com.example.segoupdated.data.remote.model.dto

data class UserSignUpResponseDto(
    val authorisation: AuthorisationDto? = null,
    val message: String? = null,
    val status: String? = null,
    val user: UserDto? = null
)