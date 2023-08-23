import io.github.wulkanowy.messages.pojo.Message
import io.github.wulkanowy.messages.pojo.MessageType
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@OptIn(ExperimentalSerializationApi::class)
val json = Json {
    encodeDefaults = true
    explicitNulls = false
}

fun generateJson(messages: List<Message>): String {
    return json.encodeToString(messages.addNewTypeMigration())
}

private fun List<Message>.addNewTypeMigration(): List<Message> {
    return map {
        if (!it.types.isNullOrEmpty()) {
            it.copy(
                // first app version, which correctly handles other types
                versionMin = 131,
                type = if (MessageType.DASHBOARD_MESSAGE in it.types!!) {
                    MessageType.DASHBOARD_MESSAGE
                } else it.types?.first(),
            )
        } else it.copy(
            type = MessageType.DASHBOARD_MESSAGE, // default value up to version 130
        )
    }
}
