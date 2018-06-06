package chapter02_kotlin_basics.exercises

enum class CaptchaTypes(val value: Int) {
    PICTURE(1), TEXT(2), RECAPTCHA(3)
}

class CaptchaResolver {
    val captchaTypePicture
            get() = CaptchaTypes.PICTURE.value

    val captchaTypeText
        get() = CaptchaTypes.TEXT.value
}

fun main(args: Array<String>) {
    println(CaptchaResolver().captchaTypePicture)
}

