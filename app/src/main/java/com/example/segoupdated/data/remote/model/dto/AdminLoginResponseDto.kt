package com.example.segoupdated.data.remote.model.dto

import com.google.gson.annotations.SerializedName

data class AdminLoginResponseDto(
    @SerializedName("companyDto")
    val companyDto: CompanyDto? = null,
    @SerializedName("status")
    val status: String? = null
)