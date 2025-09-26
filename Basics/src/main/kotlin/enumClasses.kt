//Enum constants are singleton objects.
//BASICALLY USED FOR PREDEFINING THINGS

fun main(){
    println(Direction.SOUTH)

    Direction1.SOUTH.printdata()
    Direction1.NORTH.printdata()

    println("\n printing all enum constants of direction")
    for(i in Direction.values()){
        println(i)
    }

    val w= Direction.valueOf("WEST")
    println(w)

    println(describeDirection(Direction.WEST))
}
enum class Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST
}

//enum with parameters
enum class Direction1(var direction : String , var distance : Int){
    NORTH("up",10),
    SOUTH("down",20),
    WEST("left",30),
    EAST("right",40); // important to use ; before writing function
    fun printdata(){
        println("$direction $distance")
    }
}

// when use case in enum
fun describeDirection(dir : Direction) =
    when(dir){
        Direction.NORTH -> "up"
        Direction.SOUTH -> "down"
        Direction.WEST -> "left"
        Direction.EAST -> "right"
    }