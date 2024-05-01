package io.github.wulkanowy.messages.pojo

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val id: Long,
    val title: String,
    val content: String,
    @Deprecated("use types")
    val type: MessageType? = null,
    @Deprecated("use messageTypes")
    val types: List<MessageType>? = null,
    val messageTypes: List<MessageType>? = null,
    val priority: MessagePriority = MessagePriority.LOW,
    val destinationUrl: String? = null,
    val versionMin: Int? = null,
    val versionMax: Int? = null,
    val targetRegisterHost: String? = null,
    val targetFlavor: AppFlavor? = null,
    val isXVisible: Boolean = false,
    val isOkVisible: Boolean = false,
    @Deprecated("use isXVisible or isOkVisible")
    val isDismissible: Boolean = false,
    val isVisible: Boolean = true,
)
