package lms_127

fun task6(base1: Double, base2: Double, height: Double): Double {
    val result = (height/2 * (base1 + base2))
    return result
}
fun main() {
    val answer = task6(10.0,20.0,1.0)
    println(answer)
}
