package chapter05

fun alphabet() : String {
    val result = StringBuilder()
    for (letter in 'A'..'Z')
        result.append(letter)
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

fun alphabet2() : String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z')
            this.append(letter)
        this.append("\nNow I know the alphabet!")
        this.toString()
    }
}

fun alphabet3() = with(StringBuilder()) {
    for (letter in 'A'..'Z')
        append(letter)
    append("\nNow I know the alphabet!")
    toString()
}

class OuterClass {
    override fun toString() = "OuterClass.toString"


    fun invokeOuterClassFun() = with(StringBuilder()) {
        this@OuterClass.toString()
    }
}

fun alphabet4() = StringBuilder().apply {
    for (letter in 'A'..'Z')
        append(letter)
    append("\nNow I know the alphabet")
}.toString()

fun alphabet5() = buildString {
    for (letter in 'A'..'Z')
        append(letter)
    append("\nNow I know the alphabet!")
}

fun main(args: Array<String>) {
    println(alphabet())
    println("\n${alphabet2()}")
    println("\n${alphabet3()}")

    println(OuterClass().invokeOuterClassFun())
}