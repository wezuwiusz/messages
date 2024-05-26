package io.github.wulkanowy.messages.pojo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EndMessage(

    @SerialName("isVisible")
    val isVisible: Boolean,

    @SerialName("title")
    val title: String,

    @SerialName("content")
    val content: String,
)
