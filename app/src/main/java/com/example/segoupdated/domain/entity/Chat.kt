package com.example.segoupdated.domain.entity

data class Chat(
    val chatId:Int,
   val user:User,
    val company:Company,
    val messages:MutableList<Message> = mutableListOf(),
)
