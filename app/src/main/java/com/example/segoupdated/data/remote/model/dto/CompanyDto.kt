package com.example.segoupdated.data.remote.model.dto

import com.google.gson.annotations.SerializedName

data class CompanyDto(
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("location")
    val location: String? = null,
    @SerializedName("logo")
    val logo: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("overview")
    val overview: String? = null,
    @SerializedName("specialization_id")
    val specializationId: Int? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
)