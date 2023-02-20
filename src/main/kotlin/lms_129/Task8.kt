package lms_129

fun task8(number: Int): Int {

    var result = 0
    var temporary = number

    while (temporary > 0) {
        val r = temporary % 10
        result += r
        temporary /= 10
    }

    return result
}

fun main () {
    val result = task8(123)
    println(result)
}
