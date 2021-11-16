package me.scriptori

fun min(arr: Array<Long>): Long {
    var min = arr[0]
    for (i in 1..arr.lastIndex) {
        val next = arr[i]
        if (min >= next) min = next
    }
    return min
}

fun max(arr: Array<Long>): Long {
    var max = arr[0]
    for (i in 1..arr.lastIndex) {
        val next = arr[i]
        if (max < next) max = next
    }
    return max
}

fun getResults(arr: Array<Int>): Array<Long> {
    val result = mutableListOf<Long>()
    arr.forEachIndexed { i1, _ ->
        var sum = 0L
        arr.forEachIndexed { i2, value ->
            if (i1 != i2) {
                sum += value
            }
        }
        result.add(sum)
    }
    return result.toTypedArray()
}

fun miniMaxSum(arr: Array<Int>) {
    val result = getResults(arr)
    println("${min(result)} ${max(result)}")
}
