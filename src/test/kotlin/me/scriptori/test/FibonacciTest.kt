package me.scriptori.test

import me.scriptori.FibonacciSequence
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class FibonacciTest {
    @Test
    fun fibTest() {
        val expected = arrayOf(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765)
        val fib1 = (0..20).map(FibonacciSequence::fib1).toTypedArray()
        assertContentEquals(expected, fib1)
        val fib2 = (0..20).map(FibonacciSequence::fib2).toTypedArray()
        assertContentEquals(expected, fib2)
        val fib3 = (0..20).map(FibonacciSequence::fib3).toTypedArray()
        assertContentEquals(expected, fib3)
        // Asserting the values
        assertEquals(3, FibonacciSequence.fib1(4))
        assertEquals(13, FibonacciSequence.fib1(7))
        assertEquals(6765, FibonacciSequence.fib1(20))
        // Asserting the results of the variation
        assertContentEquals(fib1, fib2)
        assertContentEquals(fib1, fib3)
    }
}
