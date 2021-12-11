package me.scriptori

fun plusMinusGreaterThen(arr: Array<Int>) = "%.6f".format(arr.filter { it > 0 }.size / arr.size.toFloat())

fun plusMinusLessThen(arr: Array<Int>) = "%.6f".format(arr.filter { it < 0 }.size / arr.size.toFloat())

fun plusMinusEqualZero(arr: Array<Int>) = "%.6f".format(arr.filter { it == 0 }.size / arr.size.toFloat())
