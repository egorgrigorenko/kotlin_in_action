package chapter02_kotlin_basics

import java.util.*

fun main(args: Array<String>) {
    // 1
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F')
        binaryReps[c] = Integer.toBinaryString(c.toInt())

    for ((letter, binary) in binaryReps)
        println("$letter = $binary")

    // 2
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex())
        println("$index: $element")
}