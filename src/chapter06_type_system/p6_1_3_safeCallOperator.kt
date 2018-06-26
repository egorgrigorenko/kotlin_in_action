package chapter06_type_system

// 1
fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

// 2
class Employee(val name: String, val manager: Employee?)

fun managerName(employee: Employee) : String? = employee.manager?.name

// 3
class Address(val streetAddress: String, val zipCode: Int, val city: String,
              val country: String)
class Company(val name: String, val address: Address?)
class Person(val name: String, val company: Company?)

fun Person.countryName() : String {
    val country = company?.address?.country
    return if (country != null) country else "Unknown"
}

fun main(args: Array<String>) {
    // 1
    printAllCaps("abc")
    printAllCaps(null)

    // 2
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))

    // 3
    val person = Person("Dmitry", null)
    println(person.countryName())
}