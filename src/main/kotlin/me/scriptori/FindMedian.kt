package me.scriptori

fun findMedian(arr: Array<Int>): Int {
    arr.sort()
    return (arr.size / 2)
}
