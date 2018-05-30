package chapter04

class User {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }

    private fun getFacebookName(id: Int): String = id.toString()
}

class User2 private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
                User2(email.substringBefore('@'))

        fun newFacebookUser(id: Int) = User2(getFacebookName(id))

        private fun getFacebookName(id: Int): String = id.toString()
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User2.newSubscribingUser("bob@gmail.com")
    val facebookUser = User2.newFacebookUser(4)
    println(subscribingUser.nickname)
}