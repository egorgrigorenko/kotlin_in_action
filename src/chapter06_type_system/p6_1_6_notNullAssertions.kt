package chapter06_type_system

fun ignoreNulls(s: String?) {
    val sNotNull = s!!
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls(null)
}