package chapter04_classes_objects_interfaces

// 1
interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int = when(e) {
    is Num -> e.value
    is Sum -> eval(e.right) + eval(e.left)
    else -> throw IllegalArgumentException("Unknown expression")
}

// 2
sealed class Expr2 {
    class Num(val value: Int): Expr2()
}

class Sum2(val left: Expr2, val right: Expr2): Expr2()

fun eval2(e: Expr2): Int = when(e) {
    is Expr2.Num -> e.value
    is Sum2 -> eval2(e.right) + eval2(e.left)
}