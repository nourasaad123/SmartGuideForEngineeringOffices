package com.example.segoupdated.domain.entity

data class Conversation(
    val chat: Chat,
    val unreadMessageCount: Int,
    val lastMessagePreview: String,
    val pinnedMessages: List<Message>
)
