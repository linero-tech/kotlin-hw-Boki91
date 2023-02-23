package lms_129

import java.util.regex.Matcher
import java.util.regex.Pattern

fun task10(password: String): Boolean {

    val pattern: Pattern
    val matcher: Matcher

    val PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$"

    pattern = Pattern.compile(PASSWORD_PATTERN)
    matcher = pattern.matcher(password)
    
    return matcher.matches()
}

fun main () {
    val result = task10("Agd$3ujk")
    println(result)
}
