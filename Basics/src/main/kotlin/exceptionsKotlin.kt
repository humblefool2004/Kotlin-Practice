fun main() {
    val a= 5
    val b= 0
    val result = try{
        println(a/b)
        //hdhjfaksdl wont execute if error occurs
        a/b
    } catch (e : ArithmeticException){
        println("You can't divide by zero: ${e.message}")
        0
    } finally {
        println("Divide by zero.")
    }
    println(result)


}