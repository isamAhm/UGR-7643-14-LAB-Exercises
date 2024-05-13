fun main() {
    println(GradeResult(87))
}

fun GradeResult(grade: Int): Char {
    val letterGrade = when {
            grade >= 90 -> 'A'
            grade >= 80 -> 'B'
            grade >= 70 -> 'C'
            grade >= 60 -> 'D'
            else -> 'F'
        }
        return letterGrade
}
