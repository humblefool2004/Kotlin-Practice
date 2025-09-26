fun main(){
    // in kotlin we have when statement instead of a switch
    println("Enter a positive integer : ")
    val num = readln().toInt()
    val ans=
        when(num%10) {
             9,8,7,6,5 -> 5
           4 -> 4
          else -> 0
        }
    println(ans)
}