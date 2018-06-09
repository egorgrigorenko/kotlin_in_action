package chapter03_functions

fun myPrintln(vararg values: String) {
    val (v1, v2, v3) = values
    println(values)
    println(v1)
    println(v2)
    println(v3)
}

fun main(args: Array<String>) {
    val list = listOf("args: ", *args)
    myPrintln("1", "2", "3")
}