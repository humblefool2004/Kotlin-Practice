import com.sun.tools.javac.Main
import kotlinx.coroutines.*
import kotlin.concurrent.thread
import kotlin.io.encoding.Base64
import kotlin.random.Random

// Coroutines work within a thread
// we cannot make many threads , it takes memory
// but we can have many coroutines

fun main() {
    println("Main program started : ${Thread.currentThread().name}")
    /*thread {
        println("Thread starts : ${Thread.currentThread().name}")
        Thread.sleep(2000)
        println("Thread ends : ${Thread.currentThread().name}")
    }*/

    //Main - android studio mein kaam karega
    //IO - input output
    // Default - basically to do some heavy work
    /*val parentJob = CoroutineScope(Dispatchers.Default).launch{
        println("Thread starts : ${Thread.currentThread().name}")
        delay(2000)  // delay will not pause the entire thread, just the specific coroutine will be paused
        println("Thread ends : ${Thread.currentThread().name}")
    }*/

    //parentJob.join() // to make this work, we will need to make the main function suspend
    //to avoid this
    /*runBlocking {
        parentJob.join()
    }*/
    val start= System.currentTimeMillis()
    val parentJob= CoroutineScope(Dispatchers.Default).launch{
        println("Parent coroutine starts : ${Thread.currentThread().name}")
        //makes another coroutine
        //if we use lauch, the data is stuck inside the coroutine, to get data outside
        // async is use .. async returns Deferred
        // you know what, lets make another file
        val job1=launch {
            val result1= getData1(Thread.currentThread().name)
            println(result1)
        }
        // if we dont want parallel execution of job1 and job2. we can use job1.join()
        // job1.join()
        // makes another coroutine
        val job2= launch {
            val result2= getData2(Thread.currentThread().name)
            println(result2)
        }
        println("Parent coroutine ends : ${Thread.currentThread().name}")
    }
    runBlocking {
        parentJob.join()
    }
    println("Total time : ${System.currentTimeMillis()- start}")
    println("Main program ends : ${Thread.currentThread().name}")

}

private suspend fun getData1(threadName: String):String{
    println("Fake work1 starts : $threadName")
    delay(2000)
    println("Fake work1 finished : $threadName")
    return "Result 1"
}
private suspend fun getData2(threadName: String):String{
    println("Fake work2 starts : $threadName")
    delay(2000)
    println("Fake work2 finished : $threadName")
    return "Result 2"
}