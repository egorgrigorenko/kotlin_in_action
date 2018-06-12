package chapter04_classes_objects_interfaces

data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val bob = Client("Bob", 987646)
    val alice = bob.copy(name = "Alice")
    println(alice)
}