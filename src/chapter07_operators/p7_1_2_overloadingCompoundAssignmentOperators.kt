package chapter07_operators

fun main(args: Array<String>) {
    // 1
    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)

    // 2
    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])

    // 3
    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)
}