fun main(){
    val numbers = mutableListOf("one","two","three","four")

    // numbers.add("five")
    val plusList = numbers + "five"
    val minusList = numbers - mutableListOf("three","four")
    println(plusList)
    println(minusList)

}