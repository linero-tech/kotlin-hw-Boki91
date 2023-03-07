package lms_129
import kotlin.math.truncate

fun task9(temperature: String): String {
/*

    var temp = temperature.uppercase()
    val result = if ("F" in temp) {
        temp = temp.replace("F", "")
        truncate(((temp.toFloat() -32)/9 *5)).toString().split(".")[0] + "C"
    }
    else if ("C" in temp) {
        temp = temp.replace("C", "")
        truncate(((temp.toFloat() / 5) * 9 + 32)).toString().split(".")[0] + "F"
    }
    else {}

    return result.toString()

 */

    val magnitude = temperature.substring(0, temperature.length-1).toDouble()
    val isCelsius = temperature.contains("C", ignoreCase = true)

    val result = if (isCelsius) {
        val conversion = (9.0 * magnitude / 5.0) + 32.0
        "${conversion.toInt()}F"
    } else {
        val conversion = (5.0 * (magnitude - 32.0)) / 9.0
        "${conversion.toInt()}C"
    }

    return result
}
fun main () {
    val result = task9("50f")
    println(result)
}
