package chapter06_type_system

fun sendEmailTo(email: String) {}

// 2
fun getTheBestPersonInTheWorld() : Person? = null

fun main(args: Array<String>) {
    // 1
    val email: String? = null
//    sendEmailTo(email)
//    if (email != null) sendEmailTo(email)
    email?.let { sendEmailTo(it) }

    // 2
    val person = getTheBestPersonInTheWorld()
    if (person != null) sendEmailTo(person.name)
    getTheBestPersonInTheWorld()?.let { sendEmailTo(it.name) }
}