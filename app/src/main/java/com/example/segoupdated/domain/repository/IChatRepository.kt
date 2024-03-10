package com.example.segoupdated.domain.repository

import com.example.segoupdated.domain.entity.Message

interface IChatRepository {
    suspend fun sendMessage(message: Message)
    suspend fun receiveMessage(): Message
    suspend fun deleteMessage(messageId: Int)
    suspend fun editMessage(messageId: Int, newText: String)


}