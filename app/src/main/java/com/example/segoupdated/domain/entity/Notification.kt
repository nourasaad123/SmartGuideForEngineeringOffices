package com.example.segoupdated.domain.entity

data class Notification(
    val notificationId:Int,
    val type: NotificationType,
    val sender: Any?,
    val messagePreview: String? = null,
    val timestamp: Long
)
