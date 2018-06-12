package chapter04_classes_objects_interfaces

class Customer(name: String) {
    val secondProperty = "Second property".also(::println)
    private val customerKey = name.toUpperCase().also(::println)

    init {
        println("First")
    }

    init {
        println("Second")
    }

    constructor(parent: String, age: Int) : this(parent) {

    }

}

fun main(args: Array<String>) {
    val customer = Customer("Egor")
//    println(customer.name)

//    val cset = CountingSet<Int>()
//    cset.addAll(listOf(1, 1, 2))
//    println("${cset.objectAdded}, ${cset.size}")
}