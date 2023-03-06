package lms_130

fun task10(items: List<Int>): List<Int> {

    var result = mutableListOf<Int>()

    items.forEach { number ->
        if (number % 2 == 0) {
            result.add(number * 2)
        } else {
            result.add(number * 3)
        }
    }

    return result
}
fun main () {
    val result = task10(listOf(1, 2, 3, 4, 5))
    println(result)
}
