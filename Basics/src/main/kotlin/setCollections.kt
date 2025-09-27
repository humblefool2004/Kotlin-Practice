fun main(){
    // NOTE- SET DOES NOT CONTAIN DUPLICATES
    // immutable set
    // val names = setOf<String>("Name 1","Name 2", "Name 3","Name 1") // here the second name 1 will not be shown
    //mutable set
    val names = mutableSetOf<String>("Name 1","Name 2", "Name 3")

    names.add("Name 4")

    names.forEach { println(it) }


    val user1= Userz("Name 1")
    val user2= Userz("Name 2")
    val user3= Userz("Name 3")
    val user4= Userz("Name 4")
    val user5= Userz("Name 5")
    val user6= Userz("Saheel")
    val user7= Userz("Saheel")

    val name = mutableSetOf<Userz>(user1,user2,user3,user4,user5,user6,user7)
    name.forEach { println(it) }
}

// set will show Saheel 2 times, if the data keyword is not used
data class Userz(val name : String)
