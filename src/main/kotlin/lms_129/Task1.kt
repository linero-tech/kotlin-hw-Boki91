package lms_129

fun task1(a: Int, b: Int): Int {

   var result = 0
/*
    METHOD #1
    if (a>=b) {
       return result
    } else {
        for (i in a..b) {
            result += i
        }
    }
     */
     // METHOD #2
    if (a < b) {
      for (i in a..b) {
          result += i
      }
    }

    return result

}
fun main() {
    val answer = task1(3,3)
    println(answer)
}
