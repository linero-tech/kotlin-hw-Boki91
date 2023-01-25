package lms_126

fun task10(): String {

    return """
       INPUT Log in here 
       INPUT Register here
       IF Log in here
       OUTPUT Write your email and password
       ELSE
       IF Register here
       OUTPUT Write your email and create the password
       INPUT Email and password
       IF Password < 6
       OUTPUT Your password needs to contain at least 6 characters. Try again.
       ELSE
       OUTPUT You have created an account. Log in here.
       
    """
}
