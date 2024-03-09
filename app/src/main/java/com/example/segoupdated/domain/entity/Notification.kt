package com.example.segoupdated.domain.entity

data class Notification(
    val notificationId: String,
    val type: NotificationType,
    val sender: Any? = null,
    val messagePreview: String? = null,
    val timestamp: Long
)
