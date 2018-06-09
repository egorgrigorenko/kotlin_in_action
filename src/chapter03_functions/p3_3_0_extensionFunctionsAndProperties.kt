package chapter03_functions

fun String.lastChar(): Char = this.get(this.length - 1)

fun String.lastChar2(): Char = get(length - 1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())
    println("Kotlin".lastChar2())
}