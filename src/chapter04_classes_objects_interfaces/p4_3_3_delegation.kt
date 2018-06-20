package chapter04_classes_objects_interfaces

// 1
//class DelegatingCollection<T> : Collection<T> {
//    private val innerList = arrayListOf<T>()
//
//    override val size: Int
//        get() = innerList.size
//
//    override fun contains(element: T): Boolean = innerList.isEmpty()
//
//    override fun containsAll(elements: Collection<T>): Boolean =
//            innerList.containsAll(elements)
//
//    override fun isEmpty(): Boolean = innerList.isEmpty()
//
//    override fun iterator(): Iterator<T> = innerList.iterator()
//}

// 2
class DelegatingCollection<T>(innerList: Collection<T> = ArrayList())
    : Collection<T> by innerList

// 3
class CountingSet<T>(private val innerSet: MutableCollection<T> = HashSet())
    : MutableCollection<T> by innerSet {

    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main(arg: Array<String>) {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}