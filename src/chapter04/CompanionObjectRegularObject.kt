package chapter04

class PersonCo(val name: String) {
    companion object Loader {
        fun fromJson(jsonText: String) = Person(jsonText)
    }
}

fun main(args: Array<String>) {
    val person = PersonCo.Loader.fromJson("{name: 'Dmitry'}")
    println(person.name)

    val person2 = PersonCo.fromJson("{name: 'Egor'}")
    println(person2.name)
}