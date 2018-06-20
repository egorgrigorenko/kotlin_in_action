package chapter04_classes_objects_interfaces

import java.io.File

// 1
object Payroll {
    val allEmployees = arrayListOf<Person>()

    fun calculateSalary() {
        for (person in allEmployees)
        ;
    }
}

// 2
object CaseIntensitiveFileComparator: Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

// 3
data class Person(val name: String) {
    object NameComparator: Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int =
                p1.name.compareTo(p2.name)
    }
}

fun main(args: Array<String>) {
    // 1
    Payroll.allEmployees.add(Person("vasya"))
    Payroll.calculateSalary()

    // 2
    println(CaseIntensitiveFileComparator.compare(
            File("/User"),
            File("/user")))

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseIntensitiveFileComparator))

    // 3
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator))
}