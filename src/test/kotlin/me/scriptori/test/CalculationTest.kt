package me.scriptori.test

import kotlin.math.abs
import kotlin.math.cos
import kotlin.test.Test
import kotlin.test.assertEquals

class CalculationTest {
    private val eps = 1E-6
    private tailrec fun findFixPoint(x: Double = 1.0): Double =
        if (abs(x - cos(x)) < eps) x else findFixPoint(cos(x))

    @Test
    fun tailRecursiveTest() {
        assertEquals(0.739085, findFixPoint(1.0))
    }
}
