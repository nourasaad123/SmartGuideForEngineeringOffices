package com.example.segoupdated.domain.usecase

import com.example.segoupdated.domain.entity.Message
import com.example.segoupdated.domain.repository.IChatRepository
import javax.inject.Inject

class MessageUseCase @Inject constructor(private val chatRepository: IChatRepository) {
    suspend fun sendMessage(message: Message) {
        return chatRepository.sendMessage(message)
    }

    suspend fun receiveMessage(): Message {
        return chatRepository.receiveMessage()

    }

    suspend fun deleteMessage(messageId: Int) {
        return chatRepository.deleteMessage(messageId)
    }

    suspend fun editMessage(messageId: Int, newText: String) {
        return chatRepository.editMessage(messageId, newText)
    }

}