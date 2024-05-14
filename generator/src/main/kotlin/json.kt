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

fun generateMessagesJson(messages: List<Message>): String {
    return json.encodeToString(messages.addNewTypeMigration())
}

fun generateMappingJson(
    endpoints: Map<String, Map<String, Map<String, String>>>,
    vTokenMap: Map<String, Map<String, Map<String, String>>>,
    vTokenSchemeMap: Map<String, Map<String, String>>,
): String {
    return json.encodeToString(
        Mapping(
            endpoints = endpoints,
            vTokens = vTokenMap,
            vTokenScheme = vTokenSchemeMap,
        )
    )
}

private val supportedTypes130 = listOf(
    MessageType.DASHBOARD_MESSAGE,
)

private val supportedTypes157 = listOf(
    MessageType.GENERAL_MESSAGE,
    MessageType.DASHBOARD_MESSAGE,
    MessageType.LOGIN_MESSAGE,
    MessageType.PASS_RESET_MESSAGE,
    MessageType.ERROR_OVERRIDE,
)

@Suppress("DEPRECATION")
private fun List<Message>.addNewTypeMigration(): List<Message> {
    return map { item ->
        item.copy(
            type = when {
                MessageType.DASHBOARD_MESSAGE in item.types.orEmpty() -> MessageType.DASHBOARD_MESSAGE
                // default value up to version 130
                item.messageTypes.isNullOrEmpty() -> MessageType.DASHBOARD_MESSAGE
                else -> item.type ?: item.messageTypes
                    ?.firstOrNull { it in supportedTypes130 }
            },
            types = item.types ?: item.messageTypes
                ?.filter { it in supportedTypes157 }
                ?.takeIf { it.isNotEmpty() },
            versionMin = item.versionMin ?: when {
                // limit new message types to first version that will support it
                (item.messageTypes.orEmpty().let { types ->
                    types.isNotEmpty() && types.all { it !in supportedTypes157 }
                }) -> 158
                // first app version, which correctly handles other types
                (item.messageTypes.orEmpty() - supportedTypes130).isNotEmpty() -> 131
                else -> null
            },
            // used up to version 145
            isDismissible = when {
                item.isXVisible -> true
                else -> item.isDismissible
            }
        )
    }
}
