package chapter05_programming_with_lambdas

fun main(args: Array<String>) {
    // 1
    val people = listOf(
            Person("Alice", 31),
            Person("Bob", 29),
            Person("Carol", 31))

    println(people.groupBy(Person::age))

    // 2
    val list = listOf("a", "ab", "b")
    println(list.groupBy(String::first))
}