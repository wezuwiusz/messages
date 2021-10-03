import io.github.wulkanowy.messages.pojo.Message

fun checkIdUniqueness(list: List<Message>) {
    val duplicates = list.groupingBy { it.id }.eachCount().filter { it.value > 1 }

    if (duplicates.isNotEmpty()) {
        throw IllegalArgumentException("Found ${duplicates.size} duplicated id(s) in messages: $duplicates")
    }
}
