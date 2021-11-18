package me.scriptori

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    // Write your code here
    val d = arrayOf(0, 0)
    a.zip(b).forEach {
        when {
            it.first > it.second -> d[0] += 1
            it.first < it.second -> d[1] += 1
        }
    }
    return d
}
