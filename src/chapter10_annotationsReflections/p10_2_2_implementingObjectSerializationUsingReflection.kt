package chapter10_annotationsReflections

import chapter08_higherOrderFunctions.joinToString
import kotlin.reflect.full.memberProperties

private fun StringBuilder.serializeObject(obj: Any) : String {
    val kClass = obj.javaClass.kotlin
    val properties = kClass.memberProperties

    return properties.joinToString(prefix = "{", postfix = "}") { prop ->
        append(prop.name)
        append(": ")
        append(prop.get(obj))
        append("\n")
        toString()
    }
}

fun serialize(obj: Any) : String = buildString { serializeObject(obj) }

fun main(args: Array<String>) {
    val person = PersonReflection("Alice", 29)
    println(serialize(person))
}