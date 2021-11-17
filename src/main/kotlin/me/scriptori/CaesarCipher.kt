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
    var result = ""
    s.forEach {
        var n = it.toInt()
        // 65..90 uppercase range in ANSI
        if (n in 65..90) {
            // Shifting it inside the alphabetic
            if (n + t > 90) n -= 26
            n += t
        }
        // 97..122 lowercase range in ANSI
        else if(n in 97..122) {
            // Shifting it inside the alphabetic
            if (n + t > 122) n -= 26
            n += t
        }
        result += n.toChar().toString()
    }
    return result
}
