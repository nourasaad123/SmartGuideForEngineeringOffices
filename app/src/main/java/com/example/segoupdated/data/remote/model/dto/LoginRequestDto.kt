package com.example.segoupdated.data.remote.model.dto

import com.google.gson.annotations.SerializedName

data class LoginRequestDto(
    @SerializedName("name")
    val name: String,
    @SerializedName("password")
    val password: String
)