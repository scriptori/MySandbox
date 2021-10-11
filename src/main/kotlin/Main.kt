import me.scriptori.FibonacciSequence

fun main(args: Array<String>) {
    println("Program arguments: ${args.joinToString()}")

    val n = if (args.isNotEmpty()) args[0].toInt() else 10
    val fib1 = (0..n).map(FibonacciSequence::fib1)
    println("fib1 = $fib1")
    val fib2 = (0..n).map(FibonacciSequence::fib2)
    println("fib2 = $fib2")
    val fib3 = (0..n).map(FibonacciSequence::fib3)
    println("fib3 = $fib3")
}
