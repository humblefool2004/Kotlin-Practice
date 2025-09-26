fun main(){

}
// We can imple
interface Engine {
    fun startEngine()
}

class Caraaa(val name : String, val color : String): Engine{
    // if we implement an interface, i have to use the members
    override fun startEngine() {
        println("The car is starting the engine.")
    }
}

class Truck(val name : String, val color: String): Engine{
    override fun startEngine() {
        println("The Truck is starting the engine")
    }
}

class Plane(val name: String,val color: String):Engine{
    override fun startEngine() {
         println("The Plane is starting the engine")
    }
}