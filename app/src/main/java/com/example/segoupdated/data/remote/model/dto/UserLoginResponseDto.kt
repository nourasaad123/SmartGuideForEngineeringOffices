package com.example.segoupdated.data.remote.model.dto

import com.google.gson.annotations.SerializedName

data class UserLoginResponseDto(
    @SerializedName("authorisationDto")
    val authorisationDto: AuthorisationDto? = null,
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("userDto")
    val userDto: UserDto? = null
)