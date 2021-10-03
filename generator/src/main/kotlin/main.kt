import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

private val json = Json {
    encodeDefaults = true
}

fun main() {
    checkIdUniqueness(messages)

    val json = json.encodeToString(messages)
    val html = generateHtml(messages)

    File("../dist/v1.json").writeText(json)
    File("../dist/index.html").writeText(html)
}
