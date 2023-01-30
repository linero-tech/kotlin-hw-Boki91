package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {
    // Do not change or delete these variables
    var a = valueForA
    var b = valueForB

    println("Before swap:")
    println("First value = $a")
    println("Second value = $b")

    val temporary = a
    a = b
    b = temporary

    println("After swap:")
    println("First value = $a")
    println("Second value = $b")

    // Do not erase or change this statement
    return Pair(a, b)
}
fun main () {
    val answer = task5(1,2)
    println(answer)
}