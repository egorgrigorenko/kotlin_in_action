package chapter08_higherOrderFunctions

fun lookForAlice3(people: List<Person>) {
    people.forEach(fun (person) {
        if (person.name == "Alice")
            return
        println("${person.name} is not Alice")
    })
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29),
            Person("Bob", 31))
    lookForAlice3(people)
}