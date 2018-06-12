package chapter04_classes_objects_interfaces

class PersonEco(val firstName: String, val lastName: String) {
    companion object
}

fun PersonEco.Companion.fromJson(json: String) = PersonEco("hi", "you")

fun main(args: Array<String>) {
    val p = PersonEco.fromJson("{}")
}