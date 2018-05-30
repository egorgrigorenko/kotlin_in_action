package chapter05

val sum = { x: Int, y: Int ->
    println("Computing the sum of $x nad $y")
    x + y
}

fun main(args: Array<String>) {
    println(sum(1, 2))
}