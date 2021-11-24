package me.scriptori

fun gradingStudents(grades: Array<Int>): Array<Int> {
    grades.forEachIndexed { i, g ->
        val delta = 5 - g % 5
        grades[i] = when {
            g < 38 -> g
            delta < 3 -> g + delta
            else -> g
        }
    }
    return grades
}
