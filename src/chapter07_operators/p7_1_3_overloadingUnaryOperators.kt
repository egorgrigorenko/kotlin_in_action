package chapter07_operators

import java.math.BigDecimal

operator fun Point.unaryMinus() = Point(-x, -y)

fun main(args: Array<String>) {
    // 1
    val p = Point(10, 20)
    println(-p)

    // 2
    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}