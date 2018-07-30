package chapter10_annotationsReflections

import java.util.*
import kotlin.reflect.KClass

interface ValueSerializer<T> {
    fun toJsonValue(value: T): Any?
    fun fromJsonValue(jsonValue: Any?): T
}

class DateSerializer: ValueSerializer<Date> {
    override fun toJsonValue(value: Date): Any? {
        return null
    }

    override fun fromJsonValue(jsonValue: Any?): Date {
        return Date()
    }
}

annotation class CustomSerializer(val serializerClass: KClass<out ValueSerializer<*>>)

data class PersonAn(
        val name: String,
        @CustomSerializer(DateSerializer::class) val birthDate: Date
)