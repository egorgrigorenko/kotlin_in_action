package chapter05

fun main(args: Array<String>) {
    val people = listOf(
            Person("Alice", 29),
            Person("Bob", 31))
    println(people.joinToString(
            separator = " ",
            transform = { p: Person -> p.name }))
    println(people.joinToString(" ") { p: Person -> p.name })
}