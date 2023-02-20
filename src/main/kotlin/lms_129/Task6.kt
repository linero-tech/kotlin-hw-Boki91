package lms_129

fun task6(number: Int): Int {

    var result = 0
    var temporary = number

    while ((temporary % 10 !==0) && (temporary > 0)) {
        val digit = temporary % 10
        result = result * 10 + digit
        temporary /= 10
    }

    return result
}
fun main () {
    val result = task6(789)
     println(result)
}