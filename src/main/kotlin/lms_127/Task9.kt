package lms_127

fun task9(sentence: String, character: Char): Boolean {
    val result = sentence.contains('i',ignoreCase = true)
    return result
}
fun main() {
    val result = task9("I code In KOTLIN",'i')
    println(result)
}
