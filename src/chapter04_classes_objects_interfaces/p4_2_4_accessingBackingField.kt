package chapter04_classes_objects_interfaces

class User9(val name: String) {
    var address: String = "unspecified"
        set(value) {
            println("""
                Address was changed for $name:
                "$field" -> "$value"""".trimIndent())
            field = value
        }
        get() = "$field!"
}