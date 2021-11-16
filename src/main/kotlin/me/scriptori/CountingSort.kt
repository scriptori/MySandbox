package me.scriptori

fun countingSort(arr: Array<Int>): Array<Int>? {
    return arr.maxOrNull()?.let { max ->
        val result = Array(max + 1) { 0 }
        for (i in arr.indices) {
            result[arr[i]] = result[arr[i]] + 1
        }
        result
    }
}

fun sortResults(countArr: Array<Int>?): Array<Int> {
    val result = mutableListOf<Int>()
    countArr?.forEachIndexed { index, i ->
        repeat(i) {
            result.add(index)
        }
    }
    return result.toTypedArray()
}
