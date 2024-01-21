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
        when {
            MessageType.DASHBOARD_MESSAGE in it.types.orEmpty() -> it.copy(
                type = MessageType.DASHBOARD_MESSAGE,
            )

            !it.types.isNullOrEmpty() -> {
                it.copy(
                    // first app version, which correctly handles other types
                    versionMin = 131,
                    type = it.types?.first(),
                )
            }

            it.isXVisible -> it.copy(
                isDismissible = true, // used up to version 145
            )

            else -> it.copy(
                type = MessageType.DASHBOARD_MESSAGE, // default value up to version 130
            )
        }
    }
}
