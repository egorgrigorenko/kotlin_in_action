package chapter09_generics

interface Producer<out T> {
    fun produce() : T
}

open class Animal {
    fun feed() {}
}

class Herd<out T: Animal>(val _list: List<T>){
    val size: Int get() = _list.size

    operator fun get(i: Int) : T = _list[i]
}


fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size)
        animals[i].feed()
}

class Cat : Animal() {
    fun cleanLitter() {}
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size)
        cats[i].cleanLitter()

    feedAll(cats)
}