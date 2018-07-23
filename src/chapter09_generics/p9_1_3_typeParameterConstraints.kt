package chapter09_generics

fun <T: Number> oneHalf(value: T) : Double {
    return value.toDouble() / 2.0
}

fun <T> ensureTrailingPeriod(seq: T)
    where T : CharSequence, T : Appendable {
    if (!seq.endsWith('.'))
        seq.append('.')
}

fun main(args: Array<String>) {
    println(listOf(1, 2, 3).sum())
    println(oneHalf(3))
//    println(max("kotlin", 42))
    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
}