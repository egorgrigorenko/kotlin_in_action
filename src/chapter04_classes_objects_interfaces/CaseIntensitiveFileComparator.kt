package chapter04_classes_objects_interfaces

import java.io.File

object CaseIntensitiveFileComparator: Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}

fun main(args: Array<String>) {
    println(CaseIntensitiveFileComparator.compare(
            File("/User"),
            File("/user")))

    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseIntensitiveFileComparator))
}