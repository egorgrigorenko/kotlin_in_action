package chapter07_operators

//// 1
//class Person4 {
//    private val _attributes = hashMapOf<String, String>()
//
//    fun setAttribute(attrName: String, value: String) {
//        _attributes[attrName] = value
//    }
//
//    val name: String
//        get() = _attributes["name"]!!
//}

// 2
class Person4 {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    var name: String by _attributes
}

fun main(args: Array<String>) {
    val p = Person4()
    val data = mapOf("name" to "Dmitry", "company" to "JetBrains")
    for ((attrName, value) in data)
        p.setAttribute(attrName, value)
    println(p.name)
}