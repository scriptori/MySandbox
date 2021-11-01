package me.scriptori.test

import kotlin.math.pow
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import me.scriptori.FibonacciSequence

class FibonacciTest {
    @Test
    fun fibTest() {
        val fib1 = (0..20).map(FibonacciSequence::fib1)
        println("fib1 = $fib1")
        val fib2 = (0..20).map(FibonacciSequence::fib2)
        println("fib2 = $fib2")
        val fib3 = (0..20).map(FibonacciSequence::fib3)
        println("fib3 = $fib3")
        // Asserting the values
        assertEquals(3, FibonacciSequence.fib1(4))
        assertEquals(13, FibonacciSequence.fib1(7))
        assertEquals(6765, FibonacciSequence.fib1(20))
        // Asserting the results of the variation
        assertContentEquals(fib1, fib2)
        assertContentEquals(fib1, fib3)
        println("2^8 = " + 2.0.pow(8))
    }
}
