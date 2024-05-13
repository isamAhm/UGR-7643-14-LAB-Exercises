import kotlin.random.Random

fun main() {
    val maxLength = 8
    val password = mutableListOf<Char>() // Create a mutable list to store characters

    for (i in 1..maxLength) {
        password.add(Random.nextInt(65, 255).toChar()) // Add random characters to the list
    }

    println(password.joinToString("")) // Convert the list to a string and print it
}
