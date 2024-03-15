package com.example.segoupdated.data.remote.model.dto

import com.google.gson.annotations.SerializedName

data class AddProjectResponseDto(
    @SerializedName("projectDto")
    val projectDto: ProjectDto? = null,
    @SerializedName("status")
    val status: String? = null
)