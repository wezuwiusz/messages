import kotlinx.serialization.encodeToString
import mapping.*
import java.io.File

fun main() {
    checkIdUniqueness(messages)

    val filteredMessages = messages.filter { it.isVisible }

    val messagesV1 = generateMessagesJson(filteredMessages)
    val mappingV1 = generateMappingJson(
        endpoints = ApiEndpointsMap,
        vTokenMap = ApiEndpointsVTokenMap,
        vTokenSchemeMap = ApiEndpointsVTokenSchemeMap,
    )
    val mappingV2 = generateMappingJson(
        endpoints = ApiEndpointsMap,
        vTokenMap = ApiEndpointsVTokenMap,
        vTokenSchemeMap = ApiEndpointsVTokenSchemeMap,
        vHeaders = ApiEndpointsVHeaders,
    )
    val mappingV3 = generateMappingJson(
        endpoints = ApiEndpointsMapV3,
        vTokenMap = ApiEndpointsVTokenMap,
        vTokenSchemeMap = ApiEndpointsVTokenSchemeMap,
        vHeaders = ApiEndpointsVHeaders,
    )
    val html = generateHtml(filteredMessages)
    val end = json.encodeToString(endMessage)

    File("../dist/v1.json").writeText(messagesV1)
    File("../dist/end.json").writeText(end)
    File("../dist/mapping1.json").writeText(mappingV1)
    File("../dist/mapping2.json").writeText(mappingV2)
    File("../dist/mapping3.json").writeText(mappingV3)
    File("../dist/index.html").writeText(html)
}
