package me.scriptori.util

import java.text.DecimalFormat
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.concurrent.TimeUnit

object DateTimeUtil {
    const val DATE_TIME_PATTERN = "HH:mm:ss.SSS"
    val df = DecimalFormat("#0.000")

    fun getTimeInMilli(timeStr: String): Long {
        return LocalTime.parse(
            timeStr,
            DateTimeFormatter.ofPattern(DATE_TIME_PATTERN)
        ).toNanoOfDay() / 1000000L
    }

    fun getTime(millis: Long): String {
        val hours = TimeUnit.MILLISECONDS.toHours(millis) % TimeUnit.DAYS.toHours(1)
        val minutes = TimeUnit.MILLISECONDS.toMinutes(millis) % TimeUnit.HOURS.toMinutes(1)
        val seconds = TimeUnit.MILLISECONDS.toSeconds(millis) % TimeUnit.MINUTES.toSeconds(1)
        val milliseconds = millis % TimeUnit.SECONDS.toMillis(1)
        return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds)
    }

    fun getTimeInSeconds(millis: Long): String {
        return df.format(millis / 1000F)
    }

    fun cleanTimeString(timeStr: String): String {
        return timeStr.replace("s*00:s*".toRegex(),"")
    }
}

