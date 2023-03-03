package lms_130

fun task3(items: List<Int>): List<Int> {

    var result = mutableListOf<Int>()
    var notDuplicated = mutableListOf<Int>()

    for (number in items) {
        if (number in notDuplicated) {
            result.add(number)
        } else {
            notDuplicated.add(number)
        }
    }




    return result.distinct().toList()
}

fun main () {
    val result = task3(listOf(5, 5, 6, 6, 4, 3, 3, 2, 1, 1))
    println(result)
}
