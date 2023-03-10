package lms_129

import java.util.regex.Matcher
import java.util.regex.Pattern

fun task10(password: String): Boolean {

    val pattern: Pattern

    val passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$]).{6,10}$"

    pattern = Pattern.compile(passwordPattern)
    val matcher: Matcher = pattern.matcher(password)

    return matcher.matches()
}

fun main () {
    val result = task10("Agd$3ujk")
    println(result)
}
