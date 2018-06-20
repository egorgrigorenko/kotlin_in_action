package chapter04_classes_objects_interfaces

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun main(args: Array<String>) {
    val listener = object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            super.mouseClicked(e)
        }

        override fun mouseEntered(e: MouseEvent?) {
            super.mouseEntered(e)
        }
    }
}