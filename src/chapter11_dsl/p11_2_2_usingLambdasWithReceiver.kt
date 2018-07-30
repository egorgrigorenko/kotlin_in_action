package chapter11_dsl

open class Tag

class Table : Tag() {
    fun tr(init: Tr.() -> Unit) {
        Tr().apply(init)
    }
}

class Tr : Tag() {
    fun td(init: Td.() -> Unit) {
        Td().apply(init)
    }
}

class Td: Tag()

class Html : Tag() {
    fun table(init: Table.() -> Unit) {
        Table().apply(init)
    }
}

fun createHtml() : Html {
    return Html()
}

fun main(args: Array<String>) {
    val html = createHtml().table {
        tr {
            td {
                println("inside td")
            }
        }
    }
}