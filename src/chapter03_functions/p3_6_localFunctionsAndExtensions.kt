package chapter03_functions

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    if (user.name.isEmpty())
        throw IllegalArgumentException("Can't save user ${user.id}: " +
                "empty Name")
    if (user.address.isEmpty())
        throw IllegalArgumentException("Can't save user ${user.id}: " +
                "empty Address")
}

fun saveUser2(user: User) {
    fun validate(user: User, value: String, fieldname: String) {
        if (value.isEmpty())
            throw IllegalArgumentException("Can't save user ${user.id}: " +
                    "empty $fieldname")
    }

    validate(user, user.name, "Name")
    validate(user, user.address, "Address")
}

fun saveUser3(user: User) {
    fun validate(value: String, fieldname: String) {
        if (value.isEmpty())
            throw IllegalArgumentException("Can't save user ${user.id}: " +
                    "empty $fieldname")
    }

    validate(user.name, "Name")
    validate(user.address, "Address")
}

fun User.validateBeforeSave() {
    fun validate(value: String, fieldname: String) {
        if (value.isEmpty())
            throw IllegalArgumentException("Can't save user ${id}: " +
                    "empty $fieldname")
    }
    validate(name, "Name")
    validate(address, "Address")
}
fun saveUser4(user: User) {
    user.validateBeforeSave()
}

fun main(args: Array<String>) {
//    saveUser(User(1, "", ""))
//    saveUser2(User(1, "", ""))
//    saveUser3(User(1, "", ""))
    saveUser4(User(1, "", ""))
}