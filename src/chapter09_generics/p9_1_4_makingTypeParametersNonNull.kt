package chapter09_generics

class Processor<T> {
    fun process(value: T) {
        value?.hashCode()
    }
}

class Processor2<T: Any> {
    fun process(value: T) {
        value.hashCode()
    }
}

fun main(args: Array<String>) {
    val nullableStringProcessor = Processor<String?>()
    nullableStringProcessor.process(null)

//    val nullableStringProcessor2 = Processor2<String?>()
}


