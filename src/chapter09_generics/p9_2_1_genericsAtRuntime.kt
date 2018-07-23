package chapter09_generics

fun main(args: Array<String>) {
    val value = listOf("hello", "world", "!")
//    if (value is List<Int>) ;
    if (value is List<*>) ;
}