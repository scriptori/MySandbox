package me.scriptori

/**
 * @param s - unencrypted string
 * @param k - number of letter rotation
 *
 * @return - The encrypted string
 */
fun caesarCipher(s: String, k: Int): String {
    // The alphabetic has 26 letters
    val t = k % 26
    // Initialize the returned string
    var result = ""
    // Iterates through all given string characters
    s.forEach {
        // Get the char int value
        var n = it.code
        // 65..90 uppercase range in ANSI
        if (n in 65..90) {
            // Shifting it inside the alphabetic order
            if (n + t > 90) n -= 26
            // Add the delta
            n += t
        }
        // 97..122 lowercase range in ANSI
        else if(n in 97..122) {
            // Shifting it inside the alphabetic order
            if (n + t > 122) n -= 26
            // Add the delta
            n += t
        }
        // Add the new char to the result string
        result += n.toChar().toString()
    }
    // Return the results
    return result
}
