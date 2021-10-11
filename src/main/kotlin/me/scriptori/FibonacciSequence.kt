package me.scriptori

/**
 * Fn = Fn-1 + Fn-2
 */
object FibonacciSequence {
    fun fib1(n: Int): Int {
        return when (n) {
            0 -> 0
            1 -> 1
            else -> fib1(n - 1) + fib1(n - 2)
        }
    }

    fun fib2(n: Int) = fib2(n, 0, 1)
    private tailrec fun fib2(n: Int, prev: Int, next: Int): Int {
        return when (n) {
            0 -> prev
            1 -> next
            else -> fib2(n - 1, next, prev + next)
        }
    }

    fun fib3(n: Int) = if (n == 0) 0 else (1 until n).fold(0 to 1) { (prev, next), _ ->
        next to (prev + next)
    }.second
}
