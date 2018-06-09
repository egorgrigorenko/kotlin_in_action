package chapter03_functions

fun Collection<String>.join(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) : String = joinToString(separator, prefix, postfix)

fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 3)
    println(list.joinToString(" "))

    println(listOf("one", "two", "eight").join(" "))
}