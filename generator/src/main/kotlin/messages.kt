import io.github.wulkanowy.messages.pojo.Message
import io.github.wulkanowy.MessagePriority
import io.github.wulkanowy.MessageType

val messages = listOf<Message>(
    Message(
        id = 1,
        title = "Problemy z Fakelogiem",
        content = "Przez błąd w systemie UONET+ (potwierdzony przez firmę VULCAN) u niektórych zadania pojawiają się dopiero w dniu terminu ich oddania. W tym czasie prosimy o uważne sprawdzanie zadań w różnych źródłach i prosimy o cierpliwość!",
        targetRegisterHost = "fakelog.cf",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
    )
)
