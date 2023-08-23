package io.github.wulkanowy.messages.pojo

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val id: Long,
    val title: String,
    val content: String,
    val type: MessageType? = null,
    val types: List<MessageType>? = null,
    val priority: MessagePriority = MessagePriority.LOW,
    val destinationUrl: String? = null,
    val versionMin: Int? = null,
    val versionMax: Int? = null,
    val targetRegisterHost: String? = null,
    val targetFlavor: AppFlavor? = null,
    val isDismissible: Boolean = false,
    val isVisible: Boolean = true,
)
