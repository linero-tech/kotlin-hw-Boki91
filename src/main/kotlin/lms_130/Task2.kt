package lms_130

fun task2(items: List<Int>): Int {

    var result = 0

    /*          METHOD 1
    for (index in items.indices) {

       var number = items[index]

       if (index % 2 == 0) {
           result += number
       } else {
           0
       }

    }

     */
    //      METHOD 2

    items.forEachIndexed{index, number ->
       if (index % 2 == 0) {
           result += number
       } else {
           0
       }
    }


    return result
}

fun main () {
    val result = task2(listOf(1, 2, 3, 4))
    println(result)
}
