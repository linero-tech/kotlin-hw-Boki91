package lms_130

fun task8(items: List<Int>): List<Int> {

    val setItem = items.toMutableSet()

    var firstHighValue = Int.MAX_VALUE * - 1
    var secondHighValue = Int.MAX_VALUE * - 1
    var thirdHighValue = Int.MAX_VALUE * - 1

    setItem.forEach{number1 ->
        if (number1 > firstHighValue) {
           firstHighValue = number1
        }
    }

    val newItem = setItem.minus(firstHighValue)

    newItem.forEach { number2 ->
        if (number2 > secondHighValue) {
            secondHighValue = number2
        }
    }

    val newItem2 = newItem.minus(secondHighValue)

    newItem2.forEach { number3 ->
        if (number3 > thirdHighValue) {
            thirdHighValue = number3
        }
    }


    return listOf(thirdHighValue, secondHighValue, firstHighValue)
}
fun main () {
    val result = task8(listOf(60, 9, 7, 10))
    println(result)
}
