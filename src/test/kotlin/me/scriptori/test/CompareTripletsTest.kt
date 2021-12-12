package me.scriptori.test

import me.scriptori.compareTriplets
import kotlin.test.Test
import kotlin.test.assertContentEquals

class CompareTripletsTest {
    @Test
    fun `compare triplets test`() {
        assertContentEquals(arrayOf(1, 1), compareTriplets(arrayOf(5, 6, 7), arrayOf(3, 6, 10)))
        assertContentEquals(arrayOf(0, 0), compareTriplets(arrayOf(3, 3, 3), arrayOf(3, 3, 3)))
        assertContentEquals(arrayOf(3, 0), compareTriplets(arrayOf(7, 6, 5), arrayOf(6, 5, 4)))
    }
}
