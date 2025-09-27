import kotlin.concurrent.thread

fun main() {
    println("Hello World! 1")
    println("Hello World! 2")
    println("Hello World! 3")
    println("Hello World! 4")
    println("Hello World! 5")

    thread {
        Thread.sleep(2000)
        println("I am different")
    }
    println("Hello World! 6")
    println("Hello World! 7")
}
