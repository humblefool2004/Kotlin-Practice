fun main(){
    println(Database)
    println(Database)

    val kaddu = User1("kaddu")

    val hattu by lazy{
        User1("hattu")
    }
    println("\nHere i already created the object, but yet the init block didnt work because of lazy\n")
    println(hattu.firstName)
    println(kaddu.firstName)
}


//achieving singleton - i.e Only one instance is possible.
//notice how the init block will rum only once even if i call Database multiple times
object Database{
    init{
        println("Database Created")
    }
}

//below is the class for lazy initialization
// Lazy initialisation ensures that the variables are initialized only after they are used for the first time.

class User1(var firstName : String){
    init{
        println("$firstName was created.")
    }
}