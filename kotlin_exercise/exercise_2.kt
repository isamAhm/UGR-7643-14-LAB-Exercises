fun main() {
    println(convertToMile(5))
}

fun convertToMile(km: Int): Int {
    val mile = km / 1.6
    return mile.toInt()
}