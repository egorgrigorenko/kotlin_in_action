package chapter06_type_system

fun fail(message: String) : Nothing {
    throw IllegalArgumentException(message)
}

fun main(args: Array<String>) {
    fail("Error occurred")

    val f = fail("Error occurred")
}