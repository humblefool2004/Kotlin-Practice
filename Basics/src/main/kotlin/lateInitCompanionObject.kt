fun main(){
    val u1= User()
    u1.favoriteMovie="Harry Potter"
    println(u1.favoriteMovie)

    println(User.max)
    println(User.sum(13,12))
}

class User(){
    //lateinit is not applicable on primitive data types
    lateinit var favoriteMovie : String

    // the below can be call without making the object of the class
    companion object{
        var max= 100
        fun sum(a: Int, b: Int) : Int=a+b
    }

}