package com.example.segoupdated.domain.entity

data class Conversation(
    val chat:Chat,
    val unreadMessageCount:Int=0,
    val lastMessagePreview:String?=null,
    val pinnedMessages:List<Message> = emptyList()
)
