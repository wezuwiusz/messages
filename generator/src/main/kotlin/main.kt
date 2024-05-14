import java.io.File

fun main() {
    checkIdUniqueness(messages)

    val filteredMessages = messages.filter { it.isVisible }

    val messagesV1 = generateMessagesJson(filteredMessages)
    val mappingV1 = generateMappingJson(
        endpoints = ApiEndpointsMap165,
        vTokenMap = ApiEndpointsVTokenMap,
        vTokenSchemeMap = ApiEndpointsVTokenSchemeMap,
    )
    val mappingV2 = generateMappingJson(
        endpoints = ApiEndpointsMap166,
        vTokenMap = ApiEndpointsVTokenMap,
        vTokenSchemeMap = ApiEndpointsVTokenSchemeMap,
    )
    val html = generateHtml(filteredMessages)

    File("../dist/v1.json").writeText(messagesV1)
    File("../dist/mapping1.json").writeText(mappingV1)
    File("../dist/mapping2.json").writeText(mappingV2)
    File("../dist/index.html").writeText(html)
}
