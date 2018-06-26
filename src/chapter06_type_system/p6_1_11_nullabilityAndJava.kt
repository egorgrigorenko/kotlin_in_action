package chapter06_type_system

fun yellAt(person: PersonJava) {
    println(person.name.toUpperCase() + "!!")
}

fun yellAtSafe(person: PersonJava) {
    println((person.name ?: "Anyone").toUpperCase() + "!!")
}

// 4
class StringPrinter: StringProcessor {
    override fun process(value: String) {
        println(value)
    }
}

class NullableStringPrinter: StringProcessor {
    override fun process(value: String?) {
        value ?: println(value)
    }
}

fun main(args: Array<String>) {
    // 1
//    yellAt(PersonJava(null))

    // 2
    yellAtSafe(PersonJava(null))

    // 3
    val s: String? = PersonJava(null).name
    val s1: String = PersonJava(null).name
}