package me.scriptori.test

import kotlin.test.Test
import kotlin.test.assertEquals
import me.scriptori.util.DateTimeUtil

class DateTimeTest {
    @Test
    fun `time with seconds test`() {
        val timeWithSeconds = 15865L
        val timeWithSecondsStr = DateTimeUtil.getTime(timeWithSeconds)
        assertEquals("00:00:15.865", timeWithSecondsStr)
        assertEquals("15.865", DateTimeUtil.getTimeInSeconds(timeWithSeconds))
        assertEquals(timeWithSeconds, DateTimeUtil.getTimeInMilli(timeWithSecondsStr))
        assertEquals("15.865", DateTimeUtil.cleanTimeString(timeWithSecondsStr))
    }

    @Test
    fun `time with minutes test`() {
        val timeWithMinutes = 75865L
        val timeWithMinutesStr = DateTimeUtil.getTime(timeWithMinutes)
        assertEquals("00:01:15.865", timeWithMinutesStr)
        assertEquals("75.865", DateTimeUtil.getTimeInSeconds(timeWithMinutes))
        assertEquals(timeWithMinutes, DateTimeUtil.getTimeInMilli(timeWithMinutesStr))
        assertEquals("01:15.865", DateTimeUtil.cleanTimeString(timeWithMinutesStr))
    }

    @Test
    fun `time with hours test`() {
        val timeWithHours = 3675865L
        val timeWithHoursStr = DateTimeUtil.getTime(timeWithHours)
        assertEquals("01:01:15.865", timeWithHoursStr)
        assertEquals("3675.865", DateTimeUtil.getTimeInSeconds(timeWithHours))
        assertEquals(timeWithHours, DateTimeUtil.getTimeInMilli(timeWithHoursStr))
        assertEquals("01:01:15.865", DateTimeUtil.cleanTimeString(timeWithHoursStr))
    }
}
