package com.example.segoupdated.data.remote.model.dto

import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("country")
    val country: String? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("email_verified_at")
    val emailVerifiedAt: Any? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image")
    val image: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("phone")
    val phone: String? = null,
    @SerializedName(" updated_at")
    val updatedAt: String? = null
)