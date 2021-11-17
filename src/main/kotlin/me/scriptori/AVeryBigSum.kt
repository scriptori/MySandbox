package me.scriptori

fun aVeryBigSum(ar: Array<Long>): Long {
    var ret = 0L
    ar.forEach {
        ret += it
    }
    return ret
}
