package chapter05_programming_with_lambdas

fun main(args: Array<String>) {
    // 1
    println(listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }
            .toList())

    // 2
    println(listOf(1, 2, 3, 4).asSequence()
            .map { it * it }.find { it > 3 })
}