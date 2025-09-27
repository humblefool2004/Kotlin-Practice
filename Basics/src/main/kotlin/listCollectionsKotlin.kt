fun main(){
    //this is a immutable list
    //val names = listOf<String>("Name 1","Name 2", "Name 3")
    // this is a mutable list
    val names = mutableListOf<String>("Name 1","Name 2", "Name 3")
    //mutable operations
    names.add("Name 4")
    names.removeAt(0)
    names.remove("Name 2")

    names.forEach { println(it) }
}