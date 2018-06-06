package chapter02_kotlin_basics

fun main(args: Array<String>) {
    // 1
    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'z'
    fun isNotDigit(c: Char) = c !in '0'..'9'

    println(isLetter('q'))
    println(isNotDigit('x'))

    // 2
    fun recognize(c: Char) = when(c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'z' -> "It's a letter!"
        else -> "I don't know..."
    }
    println(recognize('8'))

    // 3
    println("Kotlin" in "Java".."Scala")
}