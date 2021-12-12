package me.scriptori

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    // initialize the results
    val d = arrayOf(0, 0)
    // create an array of pairs a[i] to b[i] for comparison
    a.zip(b).forEach {
        when {
            // if a[i] > b[i] add 1 to d[0]
            it.first > it.second -> d[0] += 1
            // if a[i] < b[i] add 1 to d[1]
            it.first < it.second -> d[1] += 1
        }
    }
    // return the results
    return d
}
