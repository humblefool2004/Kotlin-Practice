fun main() {
    // all the functions and classes by default are public
    // just import that package and use it

    //private functions cannot be used outside the file
    //internal functions can be used inside a module only
    val user= Userm()
    user.firstName="Alex"
    user.lastName= " dobbin"
}

open class Userm{
     var firstName : String = ""  //if we set this as private, the main function wont be able to use it
    //protected keyword can be used when we want the inherited class to be able to modify that property
    var lastName : String = ""
}

class VipUser : Userm(){
    fun printInfo(){
        println(firstName)
    }

}