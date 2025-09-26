
fun main(){
    val success= Result.Success("SUCCESS!")
    val error = Result.Error("FAILED!")
    val progress = Result.Error("PROGRESS")
    getData(error)
    getData(success)
    getData(progress)
}

fun getData(result : Result){
    when(result){
        //all possible cases must be covered, since sealed class is used
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
        is Result.Progress -> result.showMessage()
    }
}

sealed class Result(val message: String){

    fun showMessage(){
        println("Result : $message")
    }
    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)
    class Progress(message: String) : Result(message)
}