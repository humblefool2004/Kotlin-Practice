fun main() {
    repeat(5){ println("hello")}

    for(i in 1 .. 5){
        print(i)
    }
    println()
    for(i in 5 downTo 1){
        print(i)
    }
    for(i in 1 until 5){
        println("hi")
    }
    for(i in 1 .. 10 step 2){
        println(i)
    }
    val arr= arrayOf("Hello", 54,22,31,true,'@', "Exit")
    for(i in arr.indices){
        println(arr[i])
    }
    for(value in arr){
        print(value)
    }
    var i=0
    do{
        i++
        print(i)
    }while(i<2)

    println()
    //breaking a loop
    hello@for(i in arr){
        if(i==true){
            break@hello
        }
        println(i)
    }

}