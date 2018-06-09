package chapter03_functions

fun main(args: Array<String>) {
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last())

    val numbers: Collection<Int> = setOf(1, 14, 2)
    println(numbers.max())
}