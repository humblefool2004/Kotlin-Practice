fun main(){
    //creating object car1
    val car1= Car("    Tesla 2025     ", color = "Red", doors = 2)
    car1.move()
    println(car1.name)
    println(car1.model)
    car1.stop()

    println()
    //creating object car2
    val car2= Car("Toyota","3896V", "Blue", 4)
    car2.move()
    println(car2.name)
    println(car2.model)
    car2.model= "BEST" +
            "Model"
    println(car2.model)
    car2.stop()

    println()
    //making object from second constructor
    val car3= Car("Scorpio", 4)
    car3.move()
    println(car3.model)
    car3.stop()
}

class Car(var name : String, var model: String="Idk", var color : String, var doors : Int){
    //INITIALIZER BLOCK    runs automatically after all the constructor parameters are defined.
    init{
        this.name= name.trim()
        if(color== "Red"){
            println("Drive safely!")
        }
    }

    fun move(){
        println("$name has started to move.")
    }
    fun stop(){
        println("$name has Stopped.")
    }


    //Secondary Constructor
    constructor(name : String , doors: Int) : this(name,"ABCDEFGHIJKLMNOP", "Default",doors)
}