import java.io.File

fun main() {
    checkIdUniqueness(messages)

    val filteredMessages = messages.filter { it.isVisible }

    val json = generateJson(filteredMessages)
    val html = generateHtml(filteredMessages)

    File("../dist/v1.json").writeText(json)
    File("../dist/index.html").writeText(html)
}
