package com.example.segoupdated.domain.entity

data class Notification(
    val notificationId: Int,
    val type: NotificationType,
    val senderId: Int,
    val messagePreview: String?,
    val timestamp: Long
)
