import io.github.wulkanowy.messages.pojo.Message
import io.github.wulkanowy.messages.pojo.MessagePriority
import io.github.wulkanowy.messages.pojo.MessageType

val messages = listOf(
    Message(
        id = 3,
        title = "Problemy z logowaniem",
        content = "Przez aktualizację dziennika Gdańskiej Platformy Edukacyjnej przestało działać logowanie w Wulkanowym. Przez to przy odświeżaniu danych pokazuje się komunikat o braku połączenia z internetem. Pracujemy nad poprawką, która powinna pojawić się w aktualizacji do końca tego tygodnia",
        priority = MessagePriority.HIGH,
        destinationUrl = "https://twitter.com/wulkanowy/status/1471930756087914511",
        targetRegisterHost = "edu.gdansk.pl",
        type = MessageType.DASHBOARD_MESSAGE,
        isVisible = true,
    ),
    Message(
        id = 2,
        title = "Problemy z aplikacją",
        content = "Występują problemy z dostępem do systemu UONET+, które są spowodowane ostatnimi aktualizacjami po stronie VULCANa. Nie jest to winą Wulkanowego. Prosimy o cierpliwość do czasu aż VULCAN rozwiąże problem po swojej stronie",
        priority = MessagePriority.MEDIUM,
        type = MessageType.DASHBOARD_MESSAGE,
        isVisible = false,
    ),
    Message(
        id = 1,
        title = "Polityka prywatności",
        content = "Zaktualizowaliśmy politykę prywatności. Kliknij aby zobaczyć więcej",
        priority = MessagePriority.LOW,
        type = MessageType.DASHBOARD_MESSAGE,
        destinationUrl = "https://wulkanowy.github.io/polityka-prywatnosci",
        isDismissible = true,
        isVisible = false,
    )
)
