package lms_130

fun task12_1(sells: List<Int>): String {

    var max = sells.first()

    sells.forEachIndexed { index, number ->
        if (number > max) {
            max = number
        }
    }

    val result = when (sells.indexOf(max)) {
        0 -> "Monday"
        1 -> "Tuesday"
        2 -> "Wednesday"
        3 -> "Thursday"
        4 -> "Friday"
        5 -> "Saturday"
        6 -> "Sunday"
        else -> "Invalid Input"
    }

    return result

}

fun task12_2(sells: List<Int>): String {

    var min = sells.first()

    sells.forEachIndexed { index, number ->
        if (number < min) {
            min = number
        }
    }

    val result = when (sells.indexOf(min)) {
        0 -> "Monday"
        1 -> "Tuesday"
        2 -> "Wednesday"
        3 -> "Thursday"
        4 -> "Friday"
        5 -> "Saturday"
        6 -> "Sunday"
        else -> "Invalid Input"
    }

    return result

}

fun task12_3(sells: List<Int>): Int {

    var result = 0

    for (numbers in sells) {
        result += numbers
    }

    return result

}

fun main () {
    val result1 = task12_1(listOf(20, 100, 800, 768, 765, 90, 10))
    println(result1)

    val result2 = task12_2(listOf(20, 100, 800, 768, 765, 90, 10))
    println(result2)

    val result3 = task12_3(listOf(20, 100, 800, 768, 765, 90, 10))
    println(result3)

}