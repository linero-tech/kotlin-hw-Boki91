package lms_126

fun task11(): String {

    return """
        INPUT Temperature in C-n
        INPUT Temperature in F-m
        IF Temperature in C-n
        Calculate (n x 9/5) + 32
        OUTPUT Temperature in C
        ELSE
        IF Temperature in F-m
        Calculate (m - 32) x 5/9
        OUTPUT Temperature in F
    """
}
