package lms_129

fun task5(sentence: String): Int {

    var result = 0

    for (i in sentence) {
        result += 1
    }

    return result
}

fun main () {
    val result = task5("I love GBG")
     println(result)
}
