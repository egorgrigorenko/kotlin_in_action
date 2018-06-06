package chapter02_kotlin_basics

class Person2(val name: String, var isMarried: Boolean)

fun main(args: Array<String>) {
    val person = Person2("Bob", true)
    println(person.name)
    println(person.isMarried)
}