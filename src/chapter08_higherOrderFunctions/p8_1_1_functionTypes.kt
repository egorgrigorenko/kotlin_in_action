package chapter08_higherOrderFunctions

fun performRequest(url: String,
                   callback: (code: Int, content: String) -> Unit) {

}

fun main(args: Array<String>) {
        val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y}
        val action: () -> Unit = { println(42) }

    var canReturnNull: (Int, Int) -> Int? = {_, _ -> null }
    var funOrNull: ((Int, Int) -> Int)? = null

    val url = "http://some-url"
    performRequest(url) { code, content -> }
    performRequest(url) { code, page -> }
}