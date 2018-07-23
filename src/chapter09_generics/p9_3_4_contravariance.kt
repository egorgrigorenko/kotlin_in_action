package chapter09_generics

// 1
interface Comparator<in T> {
    fun compare(e1: T, e2: T) : Int {
        return 0
    }
}

// 2
fun enumerateCats(f: (Cat) -> Number) {

}

fun Animal.getIndex() : Int = 0


fun main(args: Array<String>) {
    // 1
    val anyComparator = Comparator<Any> { e1, e2 -> e1.hashCode() - e2.hashCode() }
    val strings : List<String> = listOf("a", "b", "-a")
    strings.sortedWith(anyComparator)

    // 2
    enumerateCats(Animal::getIndex)
}