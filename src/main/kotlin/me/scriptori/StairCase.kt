package me.scriptori

fun staircase(n: Int) {
    (n - 1 downTo 0).forEach {
        println(" ".repeat(it) + "#".repeat(n - it))
    }
}
