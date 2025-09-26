fun main(){
    val car = Cara("BMW", "RED", 1,4)
    val plane = Planea("Boeing", "White and Blue", 4,4)

    car.move()
    plane.move()
    car.stop()
    plane.stop()
}
// here the classes plane and cara inherits from the class vehicle. i.e they can use all the properties of vehicle
open class Vehicle(val name : String, val color : String){
    open fun move(){
        println("$name is moving")
    }

    fun stop(){
        println("$name has stopped")
    }
}

class Cara(name : String, color : String, val engines : Int, val doors: Int): Vehicle(name,color) {

}

class Planea(name: String, color: String, val engines : Int, val doors: Int) : Vehicle(name,color){
    override fun move(){
        flying()
        super.move()  //calls the move function from above
    }
    fun flying(){
        println("The plane is flying")
    }
}