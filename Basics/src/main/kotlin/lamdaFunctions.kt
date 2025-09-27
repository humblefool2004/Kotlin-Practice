/*
fun main() {


    val myLambda = {a : Int,b:Int -> println("a + b = ${a+b}")}

    myLambda(31,12)

    val myLambda2= {a:Int->println(a)}
    add(5,7,myLambda2)
    // we can also write this as
    // add(5,7,{a:Int->println(a)})
    //OR
    //since the last argument is lamda
    //add(5,7) {a : Int -> println(a) }
}

fun add(a: Int,b: Int, action:(Int)->Unit){
    println("a + b = ${a+b}")
    action(a+b)
}*/


fun main() {

    val loginButton = Buttonz("Login",3254){
        //login user
    }
    val signUpButton = Buttonz("Sign Up",325344){
        //signup user
    }
}

class Buttonz(val text: String,val id: Int, val onClickListener: ()->Unit)