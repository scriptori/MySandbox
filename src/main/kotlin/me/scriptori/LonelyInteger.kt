package me.scriptori

fun lonelyInteger(a: Array<Int>): Int {
    a.forEach { i ->
        if (a.filter { c -> c == i }.size == 1)
            return i
        }
    return 0
}
