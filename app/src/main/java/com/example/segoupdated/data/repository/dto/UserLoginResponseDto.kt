package com.example.segoupdated.data.repository.dto

data class UserLoginResponseDto(
    val authorisationDto: AuthorisationDto? = null,
    val status: String? = null,
    val userDto: UserDto? = null
)