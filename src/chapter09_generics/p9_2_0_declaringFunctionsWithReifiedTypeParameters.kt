package chapter09_generics

//fun <T> isA(value: Any) = value is T

inline fun<reified T> isA(value: Any) = value is T

inline fun<reified T> Iterable<*>.filterIsInstance() : List<T> {
    val destination = mutableListOf<T>()
    for (element in this)
        if (element is T)
            destination.add(element)
    return destination
}

fun main(args: Array<String>) {
    println(isA<String>("abc"))
    println(isA<String>(123))

    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}
