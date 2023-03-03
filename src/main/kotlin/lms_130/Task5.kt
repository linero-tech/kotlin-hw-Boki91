package lms_130

fun task5(items: List<Int>): List<Int> {

    var result = mutableListOf<Int>()

    items.forEachIndexed {index, number ->
        result.add(index*number)
    }
    
    return result
}

fun main () {
    val result = task5(listOf(1, 5, 11))
    println(result)
}
