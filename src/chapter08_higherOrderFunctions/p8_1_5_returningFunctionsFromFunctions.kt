package chapter08_higherOrderFunctions

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery) : (Order) -> Double = when(delivery) {
    Delivery.EXPEDITED -> { order -> 6 + 2.1 * order.itemCount }
    else -> { order -> 1.2 * order.itemCount}
}

fun main(args: Array<String>) {
    val calc = getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${calc(Order(3))}")
}