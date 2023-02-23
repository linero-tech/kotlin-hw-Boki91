package lms_129

fun task2(number: Int): Boolean {

    var result = true

    if (number < 2) {
        result = false
    }
    for(i in 2 until  number) {
        if (number % i == 0) {
           result = false
        }
    }

    return result
}
fun main() {
    val result = task2(2)
    println(result)
}
