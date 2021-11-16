import me.scriptori.countingSort
import me.scriptori.diagonalDifference
import me.scriptori.findMedian
import me.scriptori.lonelyInteger
import me.scriptori.miniMaxSum
import me.scriptori.plusMinus
import me.scriptori.sortResults
import me.scriptori.timeConversion
import me.scriptori.util.fizzBuzz

//import me.scriptori.FibonacciSequence

fun main() {
    println("============= plusMinus ============")
    plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
    println("============= miniMaxSum ===========")
    miniMaxSum(arrayOf(1, 2, 3, 4, 5))
    println("=========== timeConversion =========")
    println(timeConversion("07:05:45PM"))
    println("============== fizzBuzz ============")
    fizzBuzz(15)
    println("============= findMedian ===========")
    println(findMedian(arrayOf(0, 1, 2, 6, 4, 7, 5, 8, 3)))
    println("=========== lonelyInteger ==========")
    println(lonelyInteger(arrayOf(1, 2, 3, 4, 3, 2, 1)))
    println("======== diagonalDifference ========")
    println(
        diagonalDifference(
            arrayOf(
                arrayOf(11, 2, 4),
                arrayOf(4, 5, 6),
                arrayOf(10, 8, -12)
            )
        )
    )
    println("=========== countingSort ===========")
    println(
        countingSort(
            arrayOf(
                63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67, 99, 12,
                83, 89, 80, 91, 39, 86, 76, 85, 74, 39, 25, 90, 59, 10, 94, 32, 44, 3, 89, 30, 27,
                79, 46, 96, 27, 32, 18, 21, 92, 69, 81, 40, 40, 34, 68, 78, 24, 87, 42, 69, 23, 41,
                78, 22, 6, 90, 99, 89, 50, 30, 20, 1, 43, 3, 70, 95, 33, 46, 44, 9, 69, 48, 33, 60,
                65, 16, 82, 67, 61, 32, 21, 79, 75, 75, 13, 87, 70, 33
            )
        )?.joinToString(" ")
    )
    val ret = countingSort(arrayOf(6, 7, 7, 3, 5, 1, 9, 2, 6, 2))
    println(ret?.joinToString(" "))
    println(sortResults(ret).joinToString(" "))

//    val n = if (args.isNotEmpty()) args[0].toInt() else 10
//    val fib1 = (0..n).map(FibonacciSequence::fib1)
//    println("fib1 = $fib1")
//    val fib2 = (0..n).map(FibonacciSequence::fib2)
//    println("fib2 = $fib2")
//    val fib3 = (0..n).map(FibonacciSequence::fib3)
//    println("fib3 = $fib3")
}
