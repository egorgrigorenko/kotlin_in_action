package chapter04

interface MouseAdapter {
    fun mouseClicked(e: String)

    fun mouseEntered(e: String)
}

class Window {
    fun addMouseListener(mouseAdapter: MouseAdapter) {
        mouseAdapter.mouseClicked("Mouse Clicked")
        mouseAdapter.mouseEntered("Mouse Entered")
    }
}

fun main(args: Array<String>) {
    var eventCount = 0

    val w = Window()
    w.addMouseListener(
            object : MouseAdapter {
                override fun mouseClicked(e: String) {
                    println("Received event: $e")
                    eventCount++
                }

                override fun mouseEntered(e: String) {
                    println("Received event: $e")
                    eventCount++
                }
            }
    )
}