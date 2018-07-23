package chapter09_generics

import java.lang.reflect.Field
import java.util.*
import kotlin.reflect.KClass

// 2
fun printFirst(list: List<*>) {
    if (list.isNotEmpty())
        println(list.first())
}

// 3
interface FieldValidator<in T> {
    fun validate(input: T) : Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String): Boolean {
        return input.isNotEmpty()
    }
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int): Boolean {
        return input >= 0
    }
}

// 3.1
object Validators {
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T: Any> registerValidator(kClass: KClass<T>,
                                   validator: FieldValidator<T>) {
        validators[kClass] = validator
    }

    @Suppress("UNCHECKED_CAST")
    fun <T: Any> get(kClass: KClass<T>) : FieldValidator<T> {
        return validators[kClass] as? FieldValidator<T>
        ?: throw IllegalArgumentException("No validator")
    }
}

fun main(args: Array<String>) {
    // 1
    val list: MutableList<Any?> = mutableListOf('a', 1, "qwe")
    val chars = mutableListOf('a', 'b', 'c')
    val unknownElements: MutableList<*> =
            if (Random().nextBoolean())
                list else chars
//    unknownElements.add(42)
    println(unknownElements.first())

    // 2
    printFirst(listOf("Svetlana", "Dmitry"))

    // 3
    val validators: MutableMap<KClass<*>, FieldValidator<*>> = mutableMapOf()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

//    validators[String::class]!!.validate("")

    val stringValidator = validators[String::class] as FieldValidator<String>
    stringValidator.validate("")

    val wrongStringValidator = validators[Int::class] as FieldValidator<String>
//    wrongStringValidator.validate("")

    // 3.1
    Validators.registerValidator(String::class, DefaultStringValidator)
    Validators.registerValidator(Int::class, DefaultIntValidator)

    println(Validators.get(Int::class).validate(42))
    println(Validators.get(String::class).validate("42"))
//    println(Validators.get(Int::class).validate("42"))
}