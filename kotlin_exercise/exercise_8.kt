
fun main() {
    println(upperCase(listOf("belete", "abebe")))
    println(greater(listOf(4, 8, 1, 2), 3))
    println(summ(listOf(1, 8, 23, 54, 12)))
}
​
fun upperCase(strings: List<String>): List<String> {
    return strings.map { it.toUpperCase() }
}
​
fun greater(numbers: List<Int>, threshold: Int): List<Int> {
    return numbers.filter { it > threshold }
}
​
fun summ(numbers: List<Int>): Int {
    return numbers.sum()
}
​
