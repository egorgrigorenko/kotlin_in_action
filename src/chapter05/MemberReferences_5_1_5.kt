package chapter05

fun sendEmail(person: Person, message: String) {
    println("Message $message was sent to $person")
}

fun main(args: Array<String>) {
    // 1
    val getAge = Person::age

    // 2
    fun salute() = println("Salute!")
    run(::salute)

    // 3
    val action = {person: Person, message: String ->
        sendEmail(person, message)
    }
    val nextAction = ::sendEmail

    // 4
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    // 5
    fun Person.isAdult() = age >= 21
    val predicate = Person::isAdult

    // 6
    val personsAgeFunction = Person::age
    println(personsAgeFunction(p))
    println(p::age)
}