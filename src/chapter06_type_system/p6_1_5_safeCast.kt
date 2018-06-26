package chapter06_type_system

fun Person.equalsName(o: Any?) : Boolean {
    val otherPerson = o as? Person ?: return false

    return otherPerson.name == name
}

fun main(args: Array<String>) {
    val p1 = Person("Dmitry", null)
    val p2 = Person("Dmitry", null)
    println(p1.equalsName(p2))
    println(p1.equalsName(42))
}