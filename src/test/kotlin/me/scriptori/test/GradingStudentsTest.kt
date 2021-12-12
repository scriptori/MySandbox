package me.scriptori.test

import me.scriptori.gradingStudents
import kotlin.test.Test
import kotlin.test.assertContentEquals

class GradingStudentsTest {
    @Test
    fun `grading students test`() {
        assertContentEquals(arrayOf(75, 67, 40, 33), gradingStudents(arrayOf(73, 67, 38, 33)))
    }
}