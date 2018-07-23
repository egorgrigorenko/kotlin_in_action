package chapter08_higherOrderFunctions

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        transform: ((T) -> String)? = null
) : String {
    val result = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0)
            result.append(separator)
        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val col = listOf("a1", "b2", "c3", "d4", "e5")
    println(col.joinToString(";", "", "") {
        it.toString().toUpperCase()
    })
    println(col.joinToString(",", "", ""))
}