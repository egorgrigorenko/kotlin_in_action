package chapter03_functions

fun main(args: Array<String>) {
    val kotlinLogo = """| //
                       .|//
                       .|/ \"""
    println(kotlinLogo)
    println(kotlinLogo.trimMargin("."))

    println("""${'$'}99.99""")
}