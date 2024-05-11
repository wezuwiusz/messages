import java.io.File

fun main() {
    checkIdUniqueness(messages)

    val filteredMessages = messages.filter { it.isVisible }

    val messagesV1 = generateMessagesJson(filteredMessages)
    val mappingV1 = generateMappingJson(ApiEndpointsMap, ApiEndpointsVTokenMap)
    val html = generateHtml(filteredMessages)

    File("../dist/v1.json").writeText(messagesV1)
    File("../dist/mapping1.json").writeText(mappingV1)
    File("../dist/index.html").writeText(html)
}
