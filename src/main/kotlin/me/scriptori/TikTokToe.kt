package me.scriptori

/***
makeMove(1, [1,1])
no winner

makeMove(2, [1,2])
no winner

makeMove(1, [2,1])
no winner

makeMove(2, [1,3])
no winner

makeMove(1, [3,1])
player 1 wins
 ***/

// player - int - player number (1 or 2)
// position - Row/Column of move
// 0 0 0
// 0 0 0
// 0 0 0
var board = arrayOf(Array(3) { 0 }, Array(3) { 0 }, Array(3) { 0 })

fun resetTikTokToe() {
    board = arrayOf(Array(3) { 0 }, Array(3) { 0 }, Array(3) { 0 })
}

fun makeMove(player: Int, position: Array<Int>) {
    println("Player $player requested position [${position[0]},${position[1]}]")
    val p0 = position[0] - 1
    val p1 = position[1] - 1

    // store move
    if (board[p0][p1] == 0)
        board[p0][p1] = player
    else
        println("\tPosition [${position[0]},${position[1]}] is not available...")

    // see if anyone won

    /*********************************
     *        Horizontally           *
     *********************************/
    board.forEachIndexed { index, arr ->
        if (arr.count { it == player } == 3) {
            println("\tThe player $player won in the row ${index + 1}!")
            return
        }
    }
    /*********************************
     *         Vertically            *
     *********************************/
    (0..2).forEach { index ->
        var count = 0
        board.forEach { arr ->
            if (arr[index] == player) count += 1
        }
        if (count == 3) {
            println("\tThe player $player won in the column ${index + 1}!")
            return
        }
    }
    /*********************************
     *     Diagonal Left to Right    *
     *********************************/
    val l2r = Array(3) { 0 }
    for (i in board.indices) {
        l2r[i] = board[i][i]
    }
    if (l2r.count { it == player } == 3) {
        println("\tThe player $player won in the left to right diagonal!")
        return
    }
    /*********************************
     *     Diagonal Right to Left    *
     *********************************/
    val r2l = Array(3) { 0 }
    for (i in board.indices) {
        r2l[i] = board[i][(board.size - 1) - i]
    }
    if (r2l.count { it == player } == 3) {
        println("\tThe player $player won in the right to left diagonal!")
        return
    }
}
