package chapter06_type_system

fun strLen(s: String) = s.length

fun strLenSafe(s: String?) : Int = if (s != null) s.length else 0

fun main(args: Array<String>) {
    // 1
//    strLen(null)

    // 2
//    val x: String? = null
//    var y: String = x
}