package chapter07_operators

data class Rectangle(val upperLeft: Point, val lowRight: Point)

operator fun Rectangle.contains(p: Point) : Boolean {
    return p.x in upperLeft.x until lowRight.x &&
            p.y in upperLeft.y until lowRight.y
}

fun main(args: Array<String>) {
    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)
    println(Point(5, 5) in rect)
}