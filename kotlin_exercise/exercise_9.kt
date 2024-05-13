class BankAccount(
    private val accountNumber: String,
    private var balance: Double
) {
    fun deposit(money: Double) {
        balance += money
    }

    fun withdraw(money: Double): Double? {
        return if (money > balance) {
            println("Not enough money")
            null
        } else {
            balance -= money
            money
        }
    }

    fun printBalance() {
        println(balance)
    }
}

fun main() {
    val account = BankAccount("2903020", 16000.0)
    account.deposit(500.0)
    account.withdraw(200.0)
    account.withdraw(1500.0)?.let {
        println("Withdrawn: $it")
    }
    account.printBalance()
}
