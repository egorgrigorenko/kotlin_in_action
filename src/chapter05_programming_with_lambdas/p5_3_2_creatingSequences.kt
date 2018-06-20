package chapter05_programming_with_lambdas

import java.io.File

fun File.isInsideHiddenDirectory() =
        generateSequence(this) { it.parentFile }.any { it.isHidden }

fun main(args: Array<String>) {
    // 1
    val naturalNumbers = generateSequence(0) { it + 1}
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum())

    // 2
    val file = File("/Users/egorgrigorenko/.config/configstore/" +
            "update-notifier-npm.json")
    println(file.isInsideHiddenDirectory())
}