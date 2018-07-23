package chapter09_generics

fun <T> copyData(source: MutableList<T>, dest: MutableList<in T>) {
    for (item in source)
        dest.add(item)
}

fun main(args: Array<String>) {
    val source = mutableListOf("A", "B", "C")
    val dest : MutableList<Any> = mutableListOf()
    copyData(source, dest)
}