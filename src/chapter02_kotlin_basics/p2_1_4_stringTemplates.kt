package chapter02_kotlin_basics

fun main(args: Array<String>) {
    if (args.isNotEmpty())
        println("Hello, ${args[0]}!")

    println("Hello, \$${args.size}")
}