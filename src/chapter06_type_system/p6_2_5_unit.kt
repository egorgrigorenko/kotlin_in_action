package chapter06_type_system

fun f() : Unit {}

fun f1() {}

interface Processor<T> {
    fun process() : T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {

    }
}