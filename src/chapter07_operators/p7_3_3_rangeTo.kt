package chapter07_operators

import java.time.LocalDate

data class Foo(val x: Int) {
    operator fun rangeTo(f: Foo) : ClosedRange<Int> = x..f.x
}

data class Bar(val x: Int) : Comparable<Bar> {
    override fun compareTo(other: Bar): Int {
        return x.compareTo(other.x)
    }
}

fun main(args: Array<String>) {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)

    val f = Foo(1)..Foo(10)
    println(50 in f)

    println(Bar(5) in Bar(1)..Bar(10))
}