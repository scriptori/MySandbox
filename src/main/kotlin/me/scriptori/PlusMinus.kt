package me.scriptori

fun plusMinus(arr: Array<Int>) {
    println("%.6f".format(arr.filter { it > 0 }.size / arr.size.toFloat()))
    println("%.6f".format(arr.filter { it < 0 }.size / arr.size.toFloat()))
    println("%.6f".format(arr.filter { it == 0 }.size / arr.size.toFloat()))
}
