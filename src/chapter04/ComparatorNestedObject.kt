package chapter04

data class Person(val name: String) {
    object NameComparator: Comparator<Person> {
        override fun compare(o1: Person, o2: Person) =
                o1.name.compareTo(o2.name)
    }
}

fun main(args: Array<String>) {
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}