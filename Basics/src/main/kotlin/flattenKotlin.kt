fun main(){
    val numbersSets = listOf(setOf(1,2,3), setOf(4,5,6), setOf(7,8,9))
    for(numbers in numbersSets){
        for(number in numbers){
            print(number)
        }
        println()
    }
    // to avoid the nested loop, we use flatten
    // converts the multidimentional  to 1D
    val numbersflatten= numbersSets.flatten()

    numbersflatten.forEach { print(it) }
    println()
}