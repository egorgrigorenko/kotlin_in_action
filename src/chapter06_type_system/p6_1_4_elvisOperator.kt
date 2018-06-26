package chapter06_type_system

// 1
fun foo(s: String?) {
    val t: String = s ?: ""
}

// 2
fun strLenSafe2(s: String?) = s?.length ?: 0

// 3
fun Person.countryName2() = company?.address?.country ?: "Unknown"

// 4
fun printShippingLabel(person: Person) {
    val address = person.company?.address
            ?: throw IllegalArgumentException("No Address")
    with(address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}


fun main(args: Array<String>) {
    // 2
    println(strLenSafe2("abc"))
    println(strLenSafe2(null))

    // 4
    val address = Address("Elsestr, 47", 80687,
            "Munich", "Germany")
    val jetbrains = Company("JetBrains", address)
    val person = Person("Dmitry", jetbrains)
    printShippingLabel(person)

    printShippingLabel(Person("Alexey", null))

}