import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File

fun main() {
    val json = Json.encodeToString(messages)

    File("../dist/v1.json").writeText(json)
}
