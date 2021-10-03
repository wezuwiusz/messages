import io.github.wulkanowy.messages.pojo.Message
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@OptIn(ExperimentalSerializationApi::class)
val json = Json {
    encodeDefaults = true
    explicitNulls = false
}

fun generateJson(messages: List<Message>): String {
    return json.encodeToString(messages)
}
