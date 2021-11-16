package me.scriptori

import kotlin.math.abs

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var l2r = 0
    var r2l = 0
    for (i in arr.indices) {
        r2l += arr[i][arr.size - 1 - i]
        l2r += arr[i][i]
    }
    return abs(l2r - r2l)
}
