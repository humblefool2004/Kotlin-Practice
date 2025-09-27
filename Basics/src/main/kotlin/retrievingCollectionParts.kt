fun main() {
    val numbers = listOf("one","two","three","four","five","six")

    println(numbers.slice(1 .. 3))
    println(numbers.slice(0 .. 4 step 2))
    println(numbers.slice(setOf(3,5,0)))
    /*[two, three, four]
    [one, three, five]
    [four, six, one]*/


    println("\n")
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.drop(1))
    println(numbers.dropLast(5))
    /*
    [one, two, three]
    [four, five, six]
    [two, three, four, five, six]
    [one]
    */
    println("\n")
    println(numbers.takeWhile { !it.startsWith("f") })
    println(numbers.takeLastWhile { it != "three" })
    println(numbers.dropWhile { it.length== 3 })
    println(numbers.dropLastWhile { it.contains("i") })
/*
    [one, two, three]
    [four, five, six]
    [three, four, five, six]
    [one, two, three, four]*/

    println()
    //making chunks
    val nums= (1..13).toList()
    println(nums.chunked(3))
    //[[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12], [13]]
    println(nums.chunked(3){it.sum()})
    //[6, 15, 24, 33, 13]

    println()
    val numbers1= numbers
    println(numbers1.windowed(3))
    //[[one, two, three], [two, three, four], [three, four, five], [four, five, six]]
    // we can add lamda in it too
}