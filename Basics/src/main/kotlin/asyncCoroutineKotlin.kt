
import kotlinx.coroutines.*


fun main() {
    println("Main program started : ${Thread.currentThread().name}")
    val start= System.currentTimeMillis()
    val parentJob= CoroutineScope(Dispatchers.Default).launch{
        println("Parent coroutine starts : ${Thread.currentThread().name}")
        //async returns last line
        val jobDeferred1=async {
            getData1(Thread.currentThread().name)
        }
        val jobDeferred2= async {
            getData2(Thread.currentThread().name)
        }
        println(jobDeferred1.await() + "\n${jobDeferred2.await()}")

        println("Parent coroutine ends : ${Thread.currentThread().name}")
    }
    runBlocking {
        parentJob.join()
    }
    parentJob.invokeOnCompletion {
        it?.let {
            println("Parent job failed : ${it.message}")
        } ?: println("Parent Job Success")
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