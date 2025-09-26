fun main(){
    val user1 = Usery("Saheel", "Mohanta")
    val user2 = Usery("Saheel", "Mohanta")
    println(user1.equals(user2))
    println(user1)
    println(user2)
}
// the data keyword overrides the things we did manually in the overrideEqualsToString.kt file
data class Usery(var firstName: String,var lastName: String){

}