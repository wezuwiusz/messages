import io.github.wulkanowy.messages.pojo.*

val messages = listOf(
    Message(
        id = 4,
        title = "Problemy z logowaniem",
        content = "Przez aktualizację dziennika Gdańskiej Platformy Edukacyjnej przestało działać logowanie w Wulkanowym. Przez to przy odświeżaniu danych pokazuje się komunikat o nieznanym błędzie dziennika. W sklepie AppGallery dostępna jest aktualizacja",
        priority = MessagePriority.HIGH,
        destinationUrl = "https://appgallery.huawei.com/app/C101440411",
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        type = MessageType.DASHBOARD_MESSAGE,
        targetFlavor = AppFlavor.HMS,
        versionMax = 101,
        isVisible = true,
    ),
    Message(
        id = 3,
        title = "Problemy z logowaniem",
        content = "Przez aktualizację dziennika Gdańskiej Platformy Edukacyjnej przestało działać logowanie w Wulkanowym. Przez to przy odświeżaniu danych pokazuje się komunikat o nieznanym błędzie dziennika. W sklepie Google Play dostępna jest aktualizacja",
        priority = MessagePriority.HIGH,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy",
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        type = MessageType.DASHBOARD_MESSAGE,
        targetFlavor = AppFlavor.PLAY,
        versionMax = 101,
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
