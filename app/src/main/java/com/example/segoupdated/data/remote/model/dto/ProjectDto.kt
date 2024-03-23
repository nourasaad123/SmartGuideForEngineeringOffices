package com.example.segoupdated.data.remote.model.dto

import com.google.gson.annotations.SerializedName

data class ProjectDto(
    @SerializedName("company_id")
    val companyId: Int? = null,
    @SerializedName("created_at")
    val createdAt: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image1")
    val image1: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("updated_at")
    val updatedAt: String? = null
)