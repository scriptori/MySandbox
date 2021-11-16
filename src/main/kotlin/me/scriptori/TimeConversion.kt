package me.scriptori

import java.text.SimpleDateFormat

fun timeConversion(s: String): String {
    val inTime = SimpleDateFormat("hh:mm:ssaa").parse(s)
    return SimpleDateFormat("HH:mm:ss").format(inTime)
}
