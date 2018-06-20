package companionObject

// 1
class Person(val name: String) {
    companion object Loader {
        fun fromJson(jsonText: String) = Person("Vasya")
    }
}

// 2
interface JsonFactory<T> {
    fun fromJson(jsonText: String) : T
}

class Person2(val name: String) {
    companion object: JsonFactory<Person2> {
        override fun fromJson(jsonText: String) = Person2("Vasya")
    }
}

fun <T> loadFromJson(factory: JsonFactory<T>) =
        factory.fromJson("{name: 'Dmitry'}")

// 3
class Person3(val firstName: String, val lastName: String) {
    companion object {

    }
}

fun Person3.Companion.fromJson(json: String) = Person3("Vasya", "Me")

fun main(args: Array<String>) {
    // 1
    val person = Person.Loader.fromJson("{name: 'Dmitry'}")
    println(person.name)

    val person2 = Person.fromJson("{name: 'Dmitry'}")
    println(person2.name)

    // 2
    loadFromJson(Person2)
    loadFromJson(Person2.Companion)

    // 3
    val p = Person3.fromJson("foo")
}