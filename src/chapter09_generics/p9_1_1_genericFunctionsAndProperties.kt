package chapter09_generics

//fun <T> List<T>.slice(indices: IntRange) : List<T> {
//    return listOf()
//}

val <T> List<T>.penultimate: T
    get() = this[size - 2]

class Foo {
//    val <T?> x: T?
//        get() = null
}

fun main(args: Array<String>) {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(10..13))

    println(listOf(1, 2, 3, 4).penultimate)
}