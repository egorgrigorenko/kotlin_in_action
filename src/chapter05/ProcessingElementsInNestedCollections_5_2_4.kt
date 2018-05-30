package chapter05

class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    // 1
    val books = listOf(
            Book("Thursday Next", listOf("Jasper Fforde")),
            Book("Mort", listOf("Terry Pratchett")),
            Book("Good Omens", listOf("Terry Pratchett", "Neil Gaiman")))
    println(books.flatMap { it.authors }.toSet())

    // 2
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
    println(strings.map { it.toList() })
}