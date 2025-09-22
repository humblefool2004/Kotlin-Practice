fun main(){
    val text : String? = null
    //safe call length method
    println(text?.length)

    // you want null pointer exception? then just do !!.
    //println(text!!.length)

    //you want the length to be shown 0? then just use the elvis operator
    // ?:  --> if null then assign the value in right
    println("The size of the text is ${text?:0}")
}