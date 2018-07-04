package chapter07_operators

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point =
            Point(x + other.x, y + other.y)

    override fun equals(obj: Any?): Boolean {
        if (obj === this) return true
        if (obj !is Point) return false
        return obj.x == x && obj.y == y
    }
}

operator fun Point.times(scale: Double) =
        Point((x* scale).toInt(), (y * scale).toInt())

operator fun Double.times(p: Point) =
        Point((p.x * this).toInt(), (p.y * this).toInt())

operator fun Char.times(count: Int) = toString().repeat(count)

fun main(args: Array<String>) {
    // 1
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)

    // 2
    println(p1 * 1.5)

    // 3
    println(1.5 * p1)

    // 4
    println('a' * 3)

    // 5
    println(0x0F and 0xF0)
    println(0x0F or 0xF0)
    println(0x1 shl 4)
}