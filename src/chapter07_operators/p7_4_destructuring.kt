package chapter07_operators

operator fun Point.component1() = x
operator fun Point.component2() = y

data class NameComponents(val name: String, val extension: String)

fun splitFilename(fullName: String): NameComponents {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents(name, extension)
}

fun main(args: Array<String>) {
    val p = Point(10, 20)
    val (x, y) = p
    println(x)
    println(y)

    val (name, ext) = splitFilename("example.kt")
    println(name)
    println(ext)
}