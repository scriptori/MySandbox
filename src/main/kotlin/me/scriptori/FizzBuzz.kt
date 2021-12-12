package me.scriptori

fun fizzBuzz(n: Int) {
    for (i in 1..n) {
        when {
            // if 'i' is multiple of 3 and multiple of 5, prints 'FizzBuzz'
            i % 3 == 0 && i % 5 == 0 -> println("FizzBuzz")
            // if 'i' is multiple of 3, prints 'Fizz'
            i % 3 == 0 -> println("Fizz")
            // if 'i' is multiple of 5 prints 'Buzz'
            i % 5 == 0 -> println("Buzz")
            // else prints 'i'
            else -> println(i)
        }
    }
}

fun main() {
    fizzBuzz(15)
}
