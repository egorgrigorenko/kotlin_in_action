package chapter05_programming_with_lambdas

fun main(args: Array<String>) {
    // 1
    val sum = {x: Int, y: Int -> x + y}
    println(sum(1, 2));

    // 2
    { println(42) }()

    // 3
    run { println(154) }

    // 4
    val sum2 = { x: Int, y : Int ->
        println("Computing the sum of $x and $y")
        x + y
    }
    println(sum2(1, 2))
}