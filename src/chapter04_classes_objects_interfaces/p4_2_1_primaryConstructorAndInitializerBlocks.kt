package chapter04_classes_objects_interfaces

// 1
class User3(val nickname: String)

// 2
class User4 constructor(nickname: String) {
    val nickname: String

    init {
        this.nickname = nickname
    }
}

// 3
class User5 constructor(nickname: String) {
    val nickname = nickname
}

// 4
open class User6(val nickname: String)

class TwitterUser(nickname: String) : User6(nickname)

// 5
open class Button3
class RadioButton: Button3()

// 6
class Secretive private constructor()

