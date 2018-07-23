package chapter08_higherOrderFunctions

// 1
//fun <T, R> Sequence<T>.map(transform: (T) -> R) : Sequence<R> {
//    return TransformingSequence(this, transform)
//}

// 2
inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {

}