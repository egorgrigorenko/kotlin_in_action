package chapter04_classes_objects_interfaces

data class Client(var name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val bob = Client("Bob", 973293)
    println(bob.copy(postalCode = 1111111))
}