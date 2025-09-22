fun main(){
    val arr= IntArray(5)
    // val arr= BooleanArray(size)
    //val arr= CharArray(size)
    for(i in 1..5){
        arr[i-1]=i
    }
    for(i in arr){
        println(i)
    }
    val arr1= arrayOf(12,23,34,45,"Saheel")
    arr1.forEach { println(it) }

    println(arr1.size)
    println(arr1.contains(43))


    val arr2= Array(5) {1}
    for (i in arr2) {
        println(i)
    }

    //important
    for(i in arr1){
        if(i is String){
            println(i)
        }
    }
}