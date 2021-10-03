import io.github.wulkanowy.messages.pojo.Message
import io.github.wulkanowy.messages.pojo.MessageType
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows

class UtilsTest {

    @Test
    fun `check message id uniqueness when really duplicates`() {
        val list = listOf(
            createMessage(1),
            createMessage(2),
            createMessage(2),
            createMessage(3),
        )

        assertThrows<IllegalArgumentException> {
            checkIdUniqueness(list)
        }
    }

    @Test
    fun `check message id uniqueness when there is no duplicates`() {
        val list = listOf(
            createMessage(1),
            createMessage(2),
            createMessage(3),
        )

        assertDoesNotThrow {
            checkIdUniqueness(list)
        }
    }

    private fun createMessage(id: Long) = Message(
        id = id,
        title = "",
        content = "",
        type = MessageType.DASHBOARD_MESSAGE,
    )
}
