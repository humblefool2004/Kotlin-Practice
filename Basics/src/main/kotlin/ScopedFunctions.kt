fun main(){
    val user = Userq()
    user.firstName="Alex"
    user.lastName="Dobbin"
    user.age= 23

    // the with scope functions return the last line of code
    with(user){
        firstName="Saheel"
        lastName= "Mohanta"
        age=21
        this //the with will return the Userq itself
    }

    //apply returns the thing in which it is applied
    //also scope is used to directly access things
    val user2= Userq().apply {
        firstName="Rahul"
        lastName= "Ban"
        age= 65
    }.also{ println(it)}

    // let scope function
    // returns the last line
    val text: String?=null
    text?.let{
        println(it)   // executes this if the value is not null
    }

    // run scope fucnction is the combination of with and let
    // returns last line
    val user3: Userq? = null
    user3?.run{
        println(firstName)
        println(lastName)
    }

}
class Userq(){
    var firstName = ""
    var lastName = ""
    var age = -1
}