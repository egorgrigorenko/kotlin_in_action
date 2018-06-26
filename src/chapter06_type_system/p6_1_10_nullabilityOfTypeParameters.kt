package chapter06_type_system

// 1
fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

// 2
fun <T: Any> printHashCode2(t: T) {
    println(t.hashCode())
}

fun main(args: Array<String>) {
    printHashCode(null)

//    printHashCode2(null)
    printHashCode2(42)
}