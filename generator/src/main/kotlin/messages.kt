import io.github.wulkanowy.messages.pojo.Message
import io.github.wulkanowy.messages.pojo.MessagePriority
import io.github.wulkanowy.messages.pojo.MessageType

val messages = listOf(
    Message(
        id = 2,
        title = "Problemy z aplikacją",
        content = "Występują problemy z dostępem do systemu UONET+, które są spowodowane ostatnimi aktualizacjami po stronie VULCANa. Nie jest to winą Wulkanowego. Prosimy o cierpliwość do czasu aż VULCAN rozwiąże problem po swojej stronie",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE
    )
)
