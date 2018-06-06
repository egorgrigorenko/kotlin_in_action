package chapter02_kotlin_basics

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun fnUntil(r: IntRange) {
    for (i in r)
        print("$i ")
}

fun main(args: Array<String>) {
    for (i in 1..100)
        print(fizzBuzz(i))
    println()
    fnUntil(1 until 4)
    println()
    for (i in 100 downTo 1 step 10)
        print(fizzBuzz(i))
}