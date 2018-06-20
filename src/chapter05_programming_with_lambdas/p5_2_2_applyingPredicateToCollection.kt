package chapter05_programming_with_lambdas

fun main(args: Array<String>) {
    // 1
    val canBeInClub27 = { p: Person -> p.age <= 27}
    val people = listOf(
            Person("Alice", 27),
            Person("Bob", 31))
    println(people.all(canBeInClub27))
    println(people.any(canBeInClub27))

    // 2
    val ll = listOf(1, 2, 3)
    println(!ll.all { it == 3 })
    println(ll.any { it != 3 })

    // 3
    println(people.count(canBeInClub27))

    // 4
    println(people.filter(canBeInClub27).size)

    // 5
    println(people.find(canBeInClub27))
}