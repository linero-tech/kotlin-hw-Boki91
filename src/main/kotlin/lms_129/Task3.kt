package lms_129

fun task3(number: Int): Int {

    var result: Int = 1
    for (i in 1..number) {
        result *= i
    }

    return result
}
 fun main() {
     val result = task3(6)
     println(result)
 }