package chapter04_classes_objects_interfaces

open class RichButton: Clickable {
    fun disable() {}
    open fun animate() {}
    final override fun click() {}
}

abstract class Animated {
    abstract fun animate()

    open fun stopAnimating() {}
    fun animateTwice() {}
}