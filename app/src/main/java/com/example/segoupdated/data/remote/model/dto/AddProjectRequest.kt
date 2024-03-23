package com.example.segoupdated.data.remote.model.dto

data class AddProjectRequest(
    val name: String,
    val description: String,
    val image: String,
    val companyName: String
)