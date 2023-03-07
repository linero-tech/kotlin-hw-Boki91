package lms_130

fun task8(items: List<Int>): List<Int> {
/*
    val setItem = items.toMutableSet()

    var firstHighValue = Int.MAX_VALUE * - 1
    var secondHighValue = Int.MAX_VALUE * - 1
    var thirdHighValue = Int.MAX_VALUE * - 1

    setItem.forEach {number1 ->
        if ( number1 > firstHighValue ) {
           firstHighValue = number1
        }
    }

    val newItems = setItem.minus(firstHighValue)

    newItems.forEach { number2 ->
        if (number2 > secondHighValue) {
            secondHighValue = number2
        }
    }

    val newItems2 = newItems.minus(secondHighValue)

    newItems2.forEach { number3 ->
        if (number3 > thirdHighValue) {
            thirdHighValue = number3
        }
    }

    return result(thirdHighValue, secondHighValue, FirstHighValue)


 */

    var result = mutableListOf(items[0], items[1], items[2]).sorted().toMutableList()
    items.forEach { item ->
        if (item > result[0] && item !in result) {
           result[0] = item
            result = result.sorted().toMutableList()
        }
    }

    return result.toSet().toList()
}
fun main () {
    val result = task8(listOf(2, 2, 1))
    println(result)
}
