package me.scriptori

fun simpleArraySum(ar: Array<Int>): Int {
    var ret = 0
    ar.forEach {
        ret += it
    }
    return ret
}
