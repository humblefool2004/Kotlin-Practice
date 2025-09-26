fun main(){

}

//MULTIPLE INHERITANCE IS NOT POSSIBLE, MULTIPLE IMPLEMENTATION IS POSSIBLE(INTERFACE)

//used for unfinished code
// when API generates code, but we know what it will do
abstract class Vehicle1(){

    val text = "some text" //this cannot be done in an interface
    abstract fun move1()
    abstract fun stop1()
}

class Caraa(var name: String,var color: String, val engines : Int, val doors:Int) : Vehicle1(){
    override fun move1(){

    }
    override fun stop1(){

    }
}