package lms_130

fun task4(items: List<Int>, factor: Int): List<Int> {

    var result = mutableListOf<Int>()

    items.forEach { number ->
        if (number % factor == 0) {
           result.add(number)
        }
    }

    return result.distinct().toList()
}

fun main () {
    val result = task4(listOf(250, 50, 250, 50, 30),10)
    println(result)
}
