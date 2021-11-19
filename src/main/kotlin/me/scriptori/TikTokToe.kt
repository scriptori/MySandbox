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
var r1 = Array(3) { 0 }
var r2 = Array(3) { 0 }
var r3 = Array(3) { 0 }
var board = arrayOf(r1, r2, r3)

fun resetTikTokToe() {
    r1 = Array(3) { 0 }
    r2 = Array(3) { 0 }
    r3 = Array(3) { 0 }
    board = arrayOf(r1, r2, r3)
}

fun makeMove(player: Int, position: Array<Int>) {
    val p0 = position[0] - 1
    val p1 = position[1] - 1

    // store move
    when (p0) {
        0 -> if (r1[p1] == 0) r1[p1] = player
        1 -> if (r2[p1] == 0) r2[p1] = player
        2 -> if (r3[p1] == 0) r3[p1] = player
    }

    // see if anyone won

    // Horizontally
    board.forEachIndexed { index, arr ->
        if (arr.count { it == player } == 3) {
            println("The player $player won in the row ${index + 1}!")
            return
        }
    }
    // Vertically
    (0..2).forEach { index ->
        var count = 0
        board.forEach { arr ->
            if (arr[index] == player) count += 1
        }
        if (count == 3) {
            println("The player $player won in the column ${index + 1}!")
            return
        }
    }
    // Diagonal left to right
    val l2r = Array(3) { 0 }
    for (y in board.indices) {
        l2r[y] = board[y][y]
    }
    if (l2r.count { it == player } == 3) {
        println("The player $player won in the left to right diagonal!")
        return
    }
    // Diagonal right to left
    val r2l = Array(3) { 0 }
    for (y in board.indices) {
        r2l[y] = board[y][(board.size - 1) - y]
    }
    if (r2l.count { it == player } == 3) {
        println("The player $player won in the right to left diagonal!")
        return
    }
}
