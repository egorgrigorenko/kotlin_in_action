package chapter09_generics

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}

fun main(args: Array<String>) {
    val strings = mutableListOf("abc", "bac")
    printContents(strings)
//    addAnswer(strings)
}