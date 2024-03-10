package com.example.segoupdated.domain.entity

data class Notification(
    val notificationId:Int,
    val type: NotificationType,
    val sender: Any? = null,
    val messagePreview: String? = null,
    val timestamp: Long
)
