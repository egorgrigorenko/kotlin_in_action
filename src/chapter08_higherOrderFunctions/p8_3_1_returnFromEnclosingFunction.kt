package chapter08_higherOrderFunctions

data class Person(val name: String, val age: Int)

fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29),
            Person("Bob", 31))
    lookForAlice(people)
}