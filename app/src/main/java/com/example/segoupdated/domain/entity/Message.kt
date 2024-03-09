package com.example.segoupdated.domain.entity

 data class Message (
     val messageId:Int,
     val content:String,
     val sender:User,
     val recipient:Any,
     val timestamp:Long,
 )