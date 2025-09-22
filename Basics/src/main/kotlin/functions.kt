fun sayHello(name : String = "World") : String{
    return ("Hello $name")
}
//all parameters are val
fun main(){
    println(sayHello())
    println(
            getMax(
                10,
                10
                )
            )
    prin(5)

    println(sum(23,213,41,44,11,1))

}

fun getMax(a:Int, b: Int) : Int = if(a>b) a else if(a==b) 0 else b
fun prin(count:Int) {
    for(i in 1..count) println(i)
}

//function with variable arguments
fun sum (vararg numbers: Int) :Int {
    println("The sum is : ")
    var sum=0
    for(number in numbers){
         sum += number
    }
    sum =0
    numbers.forEach { sum += it }
    println(numbers.size)
    return sum
}