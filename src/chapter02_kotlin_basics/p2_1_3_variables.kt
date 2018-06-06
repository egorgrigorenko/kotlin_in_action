package chapter02_kotlin_basics

fun main(args: Array<String>) {
    // 1
    val question = "The Ultimate Question of Life, the Universe, and Everything"
    val answer = 42
    val answer2: Int = 42
    val yearsToCompute = 7.5e6

    val answer3: Int
    answer3 = 42

    // 2
    val message: String
    if (canPerformOperation()) {
        message = "Success"
    } else {
        message = "Failed"
    }

    val languages = arrayListOf("Java")
    languages.add("Kotlin")

    var answer4 = 42
//    answer4 = "no answer"
}

fun canPerformOperation() = true