fun main(){
    println("Enter your name : ")
    val name = readln()
    println("Enter your age : ")
    val age= readln().toInt()
  /*  if(age >=18) println("$name is eligible to vote")
    else println("$name! Please come back after ${18-age} years")*/

    val text = if(age >= 18 ){
        println("Hello World")
        "eligible to vote." }else "not eligible to vote"
    println("$name is $text")
}