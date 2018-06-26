package chapter06_type_system

fun main(args: Array<String>) {
    // 1
    val i = 1
//    val l: Long = i
    val l: Long = i.toLong()

    // 2
    val list = listOf(1L, 2L, 3L)
//    println(i in list)
    println(i.toLong() in list)
}