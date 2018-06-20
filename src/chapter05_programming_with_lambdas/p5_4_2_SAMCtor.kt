package chapter05_programming_with_lambdas

// 1
fun createAllDoneRunnable() : Runnable {
    return Runnable {
//        println(this)
        println("All done!")
    }
}

fun main(args: Array<String>) {
    // 1
    createAllDoneRunnable().run()

    // 2
//    val listener = OnClickInterface { view ->
//        val text = when(view.id) {
//            R.id.button1 -> "First button"
//            R.id.button2 -> "Second button"
//            else -> "Unknown button"
//        }
//    }
//    button.setOnClickListener(listener)
//    button.setOnClickListener(listener)

    // 3
    class Foo {
        fun bar() {
            Runnable { println(this) }.run()
        }
    }

    // Wrong
//    Runnable { println(this) }.run()
}