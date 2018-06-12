package chapter04_classes_objects_interfaces

interface JsonFactory<T> {
    fun fromJson(jsonText: String): T
}

data class PersonCoI(val name: String) {
    companion object : JsonFactory<PersonCoI> {
        override fun fromJson(jsonText: String) = PersonCoI(jsonText)
    }
}

fun main(args: Array<String>) {
    fun <T> loadFromJson(factory: JsonFactory<T>, json: String) =
            factory.fromJson(json)

    println(loadFromJson(PersonCoI, "Egor"))
}