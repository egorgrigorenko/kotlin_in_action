package chapter11_dsl

class DependencyHandler {
    fun compile(coordinate: String) {
        println("Added dependency on $coordinate")
    }

    operator fun invoke(body: DependencyHandler.() -> Unit) {
        body()
    }
}

fun main(args: Array<String>) {
    val dependency = DependencyHandler()
    dependency.compile("org.foo.bar:kotling-1.0.0")

    dependency {
        compile("org.foo.bar:kotling-1.0.0")
    }
}