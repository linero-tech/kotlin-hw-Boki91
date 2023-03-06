package lms_130

fun task7(items: List<Int>): Int {

    var result = 0
    val smallValue = items.first()

    for (number in items) {

        if (number < smallValue) {
            result = number
        }
    }

    return result

}
fun main () {
    val result = task7(listOf(10, 5, 11))
    println(result)
}