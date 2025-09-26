fun main(){
    val saheelAccount= Account("Saheel")
    saheelAccount.deposit(1000)
    saheelAccount.withdraw(500)
    saheelAccount.deposit(-20)
    saheelAccount.withdraw(-100)
    println("${saheelAccount.accountName}'s balance is now ${saheelAccount.calculateBalance()}")
}

class Account(val accountName : String){
    private var balance =0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount : Int){
        if(amount > 0){
            transactions.add(amount)
            balance+=amount
            println("$amount deposited. $accountName balance is now $balance")
        }else println("Cannot deposit $amount")
    }

    fun withdraw(withdrawal : Int){
        if(withdrawal !in 1..balance){
            println("Withdrawal of $withdrawal is not possible")
        }else{
            transactions.add(-withdrawal)
            balance-= withdrawal
            println("$withdrawal Withdrawn. $accountName balance is now $balance")
        }
    }
    fun calculateBalance() : Int{
        balance=0
        transactions.forEach { balance+=it }
        return balance
    }
}