fun findMax(numbers: List<Int>): Int? {
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}
fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}
fun calculateAverage(numbers: List<Double>): Double {
    var sum = 0.0
    for (num in numbers) {
        sum += num
    }
    return sum / numbers.size
}
