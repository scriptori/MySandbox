package me.scriptori

/**
 * Problem to solve: Sort an integer array using counting sort:
 *    - Input: [6, 7, 7, 3, 5, 1, 9, 2, 6, 2]
 *    - Output: [1, 2, 2, 3, 5, 6, 6, 7, 7, 9]
 *
 *    Tip:
 *    Counting sorting for the input above would be [0, 1, 2, 1, 0, 1, 2, 2, 0, 1] where:
 *    0 -> 0 count
 *    1 -> 1 count
 *    2 -> 2 counts
 *    3 -> 1 count
 *    4 -> 0 count
 *    5 -> 1 count
 *    6 -> 2 counts
 *    7 -> 2 counts
 *    8 -> 0 counts
 *    9 -> 1 count
 */

fun countingSort(arr: Array<Int>): Array<Int> {
    return arr.maxOrNull()?.let { max ->   // Get the max integer in the array -> 9
        // initialize the returned array with zeros for the size based on the max number
        val result = Array(max + 1) { 0 }
        // iterates through all numbers in the original array
        for (i in arr.indices) {
            // increase the counter for number in the array position
            result[arr[i]] = result[arr[i]] + 1
        }
        // return the results
        result
    } ?: emptyArray()
}

fun sortResults(countArr: Array<Int>?): Array<Int> {
    // initialize the returned array
    val result = mutableListOf<Int>()
    // iterates through the given array if it is not null
    countArr?.forEachIndexed { index, i ->
        // repeat n times the value
        repeat(i) {
            // add the value to the returned array
            result.add(index)
        }
    }
    // return the results
    return result.toTypedArray()
}
