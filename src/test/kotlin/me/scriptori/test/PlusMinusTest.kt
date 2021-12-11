package me.scriptori.test

import me.scriptori.plusMinusEqualZero
import me.scriptori.plusMinusLessThen
import me.scriptori.plusMinusGreaterThen
import kotlin.test.Test
import kotlin.test.assertEquals

class PlusMinusTest {
    @Test
    fun `Plus minus greater then test`() {
        assertEquals("0.500000", plusMinusGreaterThen(arrayOf(-4, 3, -9, 0, 4, 1)))
    }

    @Test
    fun `Plus minus less then test`() {
        assertEquals("0.333333", plusMinusLessThen(arrayOf(-4, 3, -9, 0, 4, 1)))
    }

    @Test
    fun `Plus minus equal zero test`() {
        assertEquals("0.166667", plusMinusEqualZero(arrayOf(-4, 3, -9, 0, 4, 1)))
    }
}
