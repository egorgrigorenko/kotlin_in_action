package chapter04_classes_objects_interfaces

// 1
private interface User7 {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User7

class SubscribingUser(val email: String) : User7 {
    override val nickname: String
        get() = email.substringBefore("@")
}

fun getFacebookName(v: Int) = "Name"
class FacebookUser(val accountId: Int): User7 {
    override val nickname: String
        get() = getFacebookName(accountId)
}

// 2
interface User8 {
    var email : String
    var name: String
        get() = email.substringBefore("@")
        set(value) { this.email = ""}
}