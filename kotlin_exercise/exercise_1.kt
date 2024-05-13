fun main() {
    println(operation(1, 2, '*'))
}

fun operation(num1: Int, num2: Int, operation: Char): Int {
    return when (operation) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> {
            if (num2 != 0) {
                num1 / num2
            } else {
                throw IllegalArgumentException("Division by zero is not allowed.")
            }
        }
        else -> throw IllegalArgumentException("Invalid operation.")
    }
}
