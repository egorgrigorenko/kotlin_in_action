package chapter10_annotationsReflections

import kotlin.reflect.full.memberProperties

class PersonReflection(val name: String, val age: Int)

fun foo(x: Int) = println(x)

fun sum(x: Int, y: Int) = x + y

var counter = 0

fun main(args: Array<String>) {
    val person = PersonReflection("Alice", 29)
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach(::println)

    val kFunction = ::foo
    kFunction.call(42)

    val kFunction2 = ::sum
    println(kFunction2.invoke(1, 2) + kFunction2.invoke(3, 4))
    kFunction.call(kFunction2.invoke(10, 20))

    val kProperty = ::counter
    kProperty.setter.call(21)
    println(counter)

    val memberProperty = PersonReflection::age
    println(memberProperty.get(person))
}