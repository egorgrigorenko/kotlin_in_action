package chapter08_higherOrderFunctions

fun lookForAlice2(people: List<Person>) {
    people.forEach label@{
        if (it.name == "Alice") return@label
    }
    println("Alice might be somewhere")
}

fun main(args: Array<String>) {
    // 1
    val people = listOf(Person("Alice", 29),
            Person("Bob", 31))
    lookForAlice2(people)

    // 2
    println(StringBuilder().apply sb@{
        listOf(1, 2, 3).apply {
            this@sb.append(this.toString())
        }
    })
}