import me.scriptori.*

fun main() {
    println("============= miniMaxSum ===========")
    miniMaxSum(arrayOf(1, 2, 3, 4, 5))
    println("=========== timeConversion =========")
    println(timeConversion("07:05:45PM"))
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

    println("========== simpleArraySum ==========")
    println(simpleArraySum(arrayOf(1, 2, 3, 4, 10, 11)))

    println("============ aVeryBigSum ===========")
    println(aVeryBigSum(arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)))

    println("========= birthdayCakesCandles =========")
    println(birthdayCakesCandles(arrayOf(3, 2, 1, 3)))
    println(birthdayCakesCandles(arrayOf(3, 3, 3, 3)))
}
