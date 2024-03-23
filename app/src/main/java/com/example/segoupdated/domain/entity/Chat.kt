package com.example.segoupdated.domain.entity

data class Chat(
    val chatId: Int,
    val userId: Int,
    val companyId: Int,
    val messages: List<Message>,
)
