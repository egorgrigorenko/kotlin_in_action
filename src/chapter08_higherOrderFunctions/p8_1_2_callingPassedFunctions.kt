package chapter08_higherOrderFunctions

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean) = buildString {
    for (index in 0 until this@filter.length) {
        val element = this@filter[index]
        if (predicate(element))
            append(element)
    }
}

fun main(args: Array<String>) {
    // 1
    twoAndThree { a, b -> a + b}
    twoAndThree { a, b -> a * b}

    // 2
    println("ab1c".filter { it in 'a'..'z' })
}