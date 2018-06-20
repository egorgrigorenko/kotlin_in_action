package chapter04_classes_objects_interfaces

class A {
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

// 1
class User {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }
}

class User2 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
                User2(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
                User2(getFacebookName(accountId))
    }

}

fun main(args: Array<String>) {
    A.bar()

    val subscribingUser = User2.newSubscribingUser("bob@gmail.com")
    val facebookUser = User2.newFacebookUser(4)
    println(subscribingUser.nickname)
}