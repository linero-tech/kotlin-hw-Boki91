package lms_129
import kotlin.math.roundToInt

fun task9(temperature: String): String {

    val value = temperature.dropLast(1).toInt()
    val degree = temperature.last()

    val result = when (degree.toString().uppercase()) {
        "C" -> {((1.8 * value + 32).roundToInt().toString()) + "F"}
        "F" -> { ((value - 32) * 0.5556).roundToInt().toString()+"C" }
        else -> "Temperature Invalid"
    }
    return result
}
fun main () {
    val result = task9("-30C")
    println(result)
}
