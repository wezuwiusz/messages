import java.io.File

fun main() {
    checkIdUniqueness(messages)

    val json = generateJson(messages)
    val html = generateHtml(messages)

    File("../dist/v1.json").writeText(json)
    File("../dist/index.html").writeText(html)
}
