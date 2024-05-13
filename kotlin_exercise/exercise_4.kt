fun main() {
    val originalPrice: Float = 20.0f
    val discount: Double = 0.3
    var finalPrice: Float

    if (discount >= 0.5) {
        println("Discount is too high")
        finalPrice = (originalPrice * 0.5).toFloat()
    } else {
        finalPrice = (originalPrice - originalPrice * discount).toFloat()
        println("Final Price: $finalPrice, Original Price: $originalPrice, Discount: $discount")
    }
}
