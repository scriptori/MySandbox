package me.scriptori

fun birthdayCakesCandles(candles: Array<Int>): Int {
    val biggest = candles.maxOrNull()
    return candles.filter { it == biggest }.size
}
