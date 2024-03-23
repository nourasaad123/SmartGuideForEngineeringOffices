package com.example.segoupdated.data.remote.model.dto

import com.google.gson.annotations.SerializedName

data class AuthorisationDto(
    @SerializedName("token")
    val token: String? = null,
    @SerializedName("type")
    val type: String? = null
)