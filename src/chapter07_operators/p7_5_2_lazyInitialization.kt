package chapter07_operators

data class Email(val email: String)

fun loadEmails(person: Person2) : List<Email> {
    println("Load emails for ${person.name}")
    return listOf(Email("1"), Email("2"), Email("3"))
}

class Person2(val name: String) {
//    private var _emails: List<Email>? = null
//
//    val emails: List<Email>
//        get() {
//            if (_emails == null)
//                _emails = loadEmails(this)
//            return _emails!!
//        }
    val emails by lazy { loadEmails(this) }
}

fun main(args: Array<String>) {
    val p = Person2("Alice")
    println(p.emails)
}
