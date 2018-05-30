package chapter05

fun main(args: Array<String>) {
    // 1
    val sum = {x: Int, y: Int -> x + y}
    println(sum(1, 2));

    // 2
    { println(42) }()

    // 3
    run { println(154) }
}