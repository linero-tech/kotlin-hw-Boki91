package lms_130

fun task11_1(guests: List<String>): Int {

    return if (guests.isEmpty()) {
         0
    } else {
        guests.size
    }
}


fun task11_2(guests: List<String>, condition: String): List<String> {

    var result = mutableListOf<String>()

    guests.forEach { element ->
        val guestCondition = "-${element.last()}"

        if (guestCondition == condition) {
           result.add(element)
        }
    }
        return result.toList()

}

fun main() {

    // Change the condition to either "-V", "-A", or "-K" to test your code under different conditions
    val conditionOfInterest = "-A"
    val listOfAttendees = listOf(
        "Stéphanie-A",
        "Edmée-K",
        "Maëlla-K",
        "Océanne-K",
        "Géraldine-K",
        "Maëline-K",
    )

    println("The event has a total of ${task11_1(listOfAttendees)} attendees.")
    println("The attendees with condition $conditionOfInterest are ${task11_2(listOfAttendees, conditionOfInterest)}")
}