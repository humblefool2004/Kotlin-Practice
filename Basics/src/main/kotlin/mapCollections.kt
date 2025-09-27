fun main(){

    // MAP IS A KEY VALUE PAIR, WE CANNOT HAVE DUPLICATE KEYS
    //immutable map
    //val users = mapOf<Int, String>( 1 to "Maria", 2 to "Alex", 3 to "John" )

    //mutable map
    val users = mutableMapOf<Int, String>( 1 to "Maria", 2 to "Alex", 3 to "John" )
    users[10]= "Saheel"
    users.remove(3)
    users.forEach { k,v -> println("$k and $v") }
}