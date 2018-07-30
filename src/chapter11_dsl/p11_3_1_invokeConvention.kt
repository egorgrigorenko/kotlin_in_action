package chapter11_dsl

class Greeter(val greeting: String) {
        operator fun invoke(name: String) {
        println("$greeting, $name!")
    }
}

fun main(args: Array<String>) {
    val bavarianGreeter = Greeter("Servus")
    bavarianGreeter("Dmitry")
}