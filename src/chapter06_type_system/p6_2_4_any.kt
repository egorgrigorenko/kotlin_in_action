package chapter06_type_system

fun printAny(a: Any?) {
    println(a)
}
fun main(args: Array<String>) {
    val answer: Any? = 42
    printAny(answer)
}