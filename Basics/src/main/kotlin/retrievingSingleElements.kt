fun main() {
    val numbers = listOf("one","two","three","four","five","six")
    println(numbers.elementAt(3))
    println(numbers.first())
    println(numbers.last())
    println()
    println(numbers.first{it.length >3})
    println(numbers.last{it.startsWith("f")})
    println(numbers.random())
    println(numbers.isEmpty())
}