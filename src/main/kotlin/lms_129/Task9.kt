package lms_129
import kotlin.math.truncate

fun task9(temperature: String): String {

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
}
fun main () {
    val result = task9("-90f")
    println(result)
}
