package lms_130

fun task13_1(customers: List<String>): List<String> {

    /*
    val result = mutableListOf<String>()
    val duplicateElements = mutableListOf<String>()

    customers.forEach { items ->
        if (items in result) {
            duplicateElements.add(items)
        } else {
            result.add(items)
        }
    }
    return result.toList()
     */

    val result = customers.toMutableSet()

    return result.toList()

}

fun task13_2(customers: List<String>): List<String> {

    var result = mutableListOf<String>()
    var oneTime = mutableListOf<String>()

    customers.forEach { customer ->
       if (customer !in oneTime) {
          oneTime.add(customer)
       } else {
           result.add(customer)
       }
    }

    return result.toSet().toList()

}

fun task13_3(customers: List<String>): List<String> {

    val result = mutableSetOf<String>()

    customers.forEach { items ->
        val index1 = items.indexOf("@")
        val index2 = items.indexOf(".")
        val company = "${items.subSequence(index1 +1 , index2)}"
        result.add(company)
    }

    return result.toList()

}

fun main() {
    val listOfCustomer = listOf(
        "tgundrey1l@prlog.org",
        "bgrix1u@apache.org",
        "mbreakspear1v@wordpress.com",
        "cdalli1w@ft.com",
        "rclayborn1x@mtv.com",
        "rclayborn1x@mtv.com",
        "jchidlow1y@nasa.gov",
        "jchidlow1y@nasa.gov",
        "kovell1z@washingtonpost.com",
        "kovell1z@washingtonpost.com",
        "kovell1z@washingtonpost.com"
    )

    println("The customers who purchased from your product: ${task13_1(listOfCustomer)}")
    println("The customers that purchased multiple times include: ${task13_2(listOfCustomer)}")
    println("The companies that purchased from you include: ${task13_3(listOfCustomer)}")
}
