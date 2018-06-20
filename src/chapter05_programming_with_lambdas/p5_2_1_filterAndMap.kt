package chapter05_programming_with_lambdas

fun main(args: Array<String>) {
    // 1
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })

    // 2
    val people = listOf(Person("Alice", 29),
            Person("Bob", 31))
    println(people.filter { it.age > 30 })

    // 3
    val ll = listOf(1, 2, 3, 4)
    println(ll.map { it * it })

    // 4
    println(people.map { it.name })
    println(people.map(Person::name))

    // 5
    println(people.filter { it.age > 30 }.map(Person::name))

    // 6
    people.filter { it.age == people.maxBy(Person::age)!!.age }
    val maxAge = people.maxBy(Person::age)!!.age
    people.filter { it.age == maxAge }

    // 7
    val numbers = mapOf(0 to "zero", 1 to "one")
    println("number: $numbers")
    println(numbers.map { it.value.toUpperCase() })
    println(numbers.mapValues { it.value.toUpperCase() })
}