package chapter04_classes_objects_interfaces

import javax.naming.Context
import javax.swing.text.AttributeSet

// 1
open class View2 {
    constructor(ctx: Context) {}
    constructor(ctx: Context, attr: AttributeSet) {}
}

class MyButton : View2 {
    constructor(ctx: Context) : super(ctx)
    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr)
}

// 2
//class MyButton2 : View2 {
//    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr)
//    constructor(ctx: Context) : this(ctx, MY_STYLE)
//}

// 3
//private class Foo {
//    constructor(val s: String)
//    constructor(val i: Int) : this("hi")
//
//    constructor(val d: Double): this("world!")
//}