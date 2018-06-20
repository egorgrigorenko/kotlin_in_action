package chapter05_programming_with_lambdas

fun main(args: Array<String>) {
    val button = p5_4_0_JavaButton()
    button.setOnClickListener { view -> view.click() }
}