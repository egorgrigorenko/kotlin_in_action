package chapter07_operators

class Person (val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person)
            = compareValuesBy(this, other, Person::lastName, Person::firstName)
}

fun main(args: Array<String>) {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)
}