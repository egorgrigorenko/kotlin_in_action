package chapter06_type_system

fun <T> copyElements(source: Collection<T>,
                     target: MutableCollection<T>) {
    for (item in source)
        target.add(item)
}

fun main(args: Array<String>) {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf()
//    val target: Collection<Int> = arrayListOf()
    copyElements(source, target)
    println(target)
}