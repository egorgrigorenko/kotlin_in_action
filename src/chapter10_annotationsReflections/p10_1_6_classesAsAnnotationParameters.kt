package chapter10_annotationsReflections

import kotlin.reflect.KClass

interface Company {
    val name: String
}

data class CompanyImpl(override val name: String) : Company


annotation class DeserializeInterface(val targetClass: KClass<out Any>)

data class Person(
        val name: String,
        @DeserializeInterface(CompanyImpl::class) val company : Company
)