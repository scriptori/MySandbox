import me.scriptori.*

fun main() {
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

    println("============= staircase ============")
    staircase(6)

    println("========== simpleArraySum ==========")
    println(simpleArraySum(arrayOf(1, 2, 3, 4, 10, 11)))

    println("============ aVeryBigSum ===========")
    println(aVeryBigSum(arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)))

    println("============ compareTriplets ===========")
    println(compareTriplets(arrayOf(5, 6, 7), arrayOf(3, 6, 10)).joinToString(" "))
    println("========= birthdayCakesCandles =========")
    println(birthdayCakesCandles(arrayOf(3, 2, 1, 3)))
    println(birthdayCakesCandles(arrayOf(3, 3, 3, 3)))
    println("============= Tik Tok Toe ==============")
    // The player 1 won in the row 1!
    makeMove(1, arrayOf(1, 1))
    makeMove(1, arrayOf(1, 2))
    makeMove(1, arrayOf(1, 3))
    // The player 1 won in the left to right diagonal!
    resetTikTokToe()
    makeMove(1, arrayOf(1, 1))
    makeMove(1, arrayOf(2, 2))
    makeMove(1, arrayOf(3, 3))
    // The player 1 won in the right to left diagonal!
    resetTikTokToe()
    makeMove(1, arrayOf(1, 3))
    makeMove(1, arrayOf(2, 2))
    makeMove(1, arrayOf(3, 1))
    // The player 2 won in the row 2!
    resetTikTokToe()
    makeMove(2, arrayOf(2, 1))
    makeMove(2, arrayOf(2, 2))
    makeMove(2, arrayOf(2, 3))
    // The player 2 won in column 3!
    resetTikTokToe()
    makeMove(2, arrayOf(1, 3))
    makeMove(2, arrayOf(2, 3))
    makeMove(2, arrayOf(3, 3))
    // The player 1 won in the right to left diagonal!
    resetTikTokToe()
    makeMove(2, arrayOf(1, 3))
    makeMove(1, arrayOf(1, 3))
    makeMove(2, arrayOf(2, 2))
    makeMove(2, arrayOf(3, 1))
    println("=========== Grading Students ==========")
    println(gradingStudents(arrayOf(73, 67, 38, 33)).joinToString("\n"))
}
