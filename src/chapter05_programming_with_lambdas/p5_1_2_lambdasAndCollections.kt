package chapter05_programming_with_lambdas

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) : Person? {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    return theOldest
}

fun main(args: Array<String>) {
    val people = listOf(
            Person("Alice", 29),
            Person("Bob", 31))

    // 1
    println(findTheOldest(people))

    // 2
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))

    // 3
    println(people.maxBy({ p: Person -> p.age }))
    println(people.maxBy() { p: Person -> p.age })
    println(people.maxBy { p: Person -> p.age })
    println(people.maxBy { p -> p.age })

    // 4
//    val getAge = { it.age }
    val getAge = { p: Person -> p.age }
    people.maxBy(getAge)
}