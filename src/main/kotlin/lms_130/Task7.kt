package lms_130

fun task7(items: List<Int>): Int {

    var result = Int.MAX_VALUE

    for (i in items) {
       result = result.coerceAtMost(i)
    }

    if (items.isEmpty()) {
        result = 0
    }


    return result
}
fun main () {
    val result = task7(listOf<Int>(-100, -90, -100, 1, -2, 3))
    println(result)
}