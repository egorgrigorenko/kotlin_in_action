package chapter03_functions

fun main(args: Array<String>) {
    val str = "12.345-6.A"
    println(str.split(".", "-"))
    println(str.split("[.\\-]".toRegex()))
}