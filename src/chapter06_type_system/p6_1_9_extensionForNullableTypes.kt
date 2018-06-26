package chapter06_type_system

fun String?.isNullOrBlank() = this == null || this.isBlank()

fun main(args: Array<String>) {
    val s: String? = null
    println(s.isNullOrBlank())
}