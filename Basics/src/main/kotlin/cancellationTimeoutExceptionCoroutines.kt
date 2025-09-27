
import kotlinx.coroutines.*
val handler= CoroutineExceptionHandler { _, exception ->
    println("Error in one of the children : ${exception.message}")
}
// to use this handler , we have to use supervisorScope

fun main() {
    println("Main program started : ${Thread.currentThread().name}")
    val start= System.currentTimeMillis()
    val parentJob= CoroutineScope(Dispatchers.Default).launch(handler){
        println("Parent coroutine starts : ${Thread.currentThread().name}")
        //async returns last line
        supervisorScope {
            val job1=launch {
                try {
                    println(getData1(Thread.currentThread().name))

                }catch (ex : CancellationException){
                    println("Exception caught safely : ${ex.message}")
                }finally {
                    println("Resources closed safely")
                }
                //check whether the coroutine is active or not
                if(!isActive)
                    return@launch

            }
            job1.cancel(CancellationException("My own error message"))
            job1.join()
            //job1.cancelAndJoin()
            /*//using timeout
            val job2= withTimeout(1000) {
                println(getData2(Thread.currentThread().name))
            }*/
            val job2= launch {
                println(getData2(Thread.currentThread().name))
            }

            val job3= launch {
                println(getData3(Thread.currentThread().name))
            }
        }
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
    /*
    throw Exception("Error while getting data in getData1())
    if we throw this, we must use try catch, allowing other coroutines to work properly
    Cancellation Exception is a special case
    to write try catch again and again, we use coroutine exception handler.. upppar kahi declared hoga dekho
    */
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

private suspend fun getData3(threadName: String):String{
    println("Fake work3 starts : $threadName")
    delay(2000)
    println("Fake work3 finished : $threadName")
    return "Result 2"
}

// switching threads
private suspend fun  setTextOnMainThread(input : String){
    withContext(Main){
        //add code to update
    }
}


// lazy coroutine
// val job1= async(CoroutineStart.LAZY){ getData1(Thread.currentThread().name) }