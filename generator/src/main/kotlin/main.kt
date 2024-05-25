import kotlinx.serialization.encodeToString
import mapping.ApiEndpointsMap
import mapping.ApiEndpointsVHeaders
import mapping.ApiEndpointsVTokenMap
import mapping.ApiEndpointsVTokenSchemeMap
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
    val html = generateHtml(filteredMessages)
    val end = json.encodeToString(mapOf("end" to false))

    File("../dist/v1.json").writeText(messagesV1)
    File("../dist/end.json").writeText(end)
    File("../dist/mapping1.json").writeText(mappingV1)
    File("../dist/mapping2.json").writeText(mappingV2)
    File("../dist/index.html").writeText(html)
}
