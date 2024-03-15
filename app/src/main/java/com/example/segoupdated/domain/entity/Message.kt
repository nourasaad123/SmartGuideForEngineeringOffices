package com.example.segoupdated.domain.entity

data class Message(
    val id: Int,
    val content: String,
    val senderId: Int,
    val recipientId: Int,
    val timestamp: Long,
)