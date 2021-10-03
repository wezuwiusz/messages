import io.github.wulkanowy.messages.pojo.Message
import kotlinx.html.*
import kotlinx.html.stream.appendHTML
import java.time.LocalDate
import java.time.LocalDateTime

fun generateHtml(messages: List<Message>): String = buildString {
    appendLine("<!DOCTYPE html>")
    appendHTML().html {
        lang = "pl"
        head {
            meta { charset = "UTF-8" }
            title("Wulkanowy Messages")
        }
        body {
            h1 { +"Wulkanowy Messages" }
            ul {
                messages.forEach {
                    li {
                        b {
                            +"${it.id}. "
                            if (!it.destinationUrl.isNullOrBlank()) {
                                a(it.destinationUrl) {
                                    +it.title
                                }
                            } else +it.title
                        }
                        br
                        span {
                            +it.content
                        }
                    }
                }
            }
            footer {
                +"© ${LocalDate.now().year} by Wulkanowy | "
                +"wygenerowano ${LocalDateTime.now()} | "
                a("v1.json") {
                    +"raw json"
                }
            }
        }
    }
}
