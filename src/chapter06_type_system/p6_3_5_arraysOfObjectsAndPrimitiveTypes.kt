package chapter06_type_system

fun main(args: Array<String>) {
    // 1
    for (j in args.indices)
        println("Argument $j is ${args[j]}")

    // 2
    val letters = Array(26) {j -> ('a' + j).toString() }
    println(letters.joinToString(""))

    val strings = listOf("a", "b", "c")
    println("%s/%s/%s".format(*strings.toTypedArray()))

    // 3
    val fiveZeros = IntArray(5)
    val fiveZerosToo = intArrayOf(0, 0, 0, 0, 0)

    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
    println(squares.joinToString())
}