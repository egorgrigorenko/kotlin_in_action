package chapter06_type_system

fun printInUppercase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main(args: Array<String>) {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}