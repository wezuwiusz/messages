package io.github.wulkanowy.messages.pojo

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val id: Long,
    val title: String,
    val content: String,
    val type: MessageType,
    val priority: MessagePriority = MessagePriority.LOW,
    val destinationUrl: String? = null,
    val versionMin: Int? = null,
    val versionMax: Int? = null,
    val targetRegisterHost: String? = null,
    val targetFlavor: AppFlavor? = null,
)
