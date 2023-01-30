package lms_127

fun task8(sentence: String, character: Char): Int {
    val result = sentence.count{it=='I'}
    return result
}
fun main() {
    val result = task8("I code in KOTLIN",'I')
    println(result)
}