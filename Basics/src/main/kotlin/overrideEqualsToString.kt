
fun main(){
    val user1=Userx("Saheel","Mohanta",21)
    val user2=Userx("Saheel", "Mohanta",21)
    println(user1 == user2) // this is giving false because user1 and user2 are two different objects, even if their contents are the same
    println(user1) // some reference code before overriding
}

class  Userx(var firstName: String,var lastName: String, var age: Int){
    //to fix the == issue
    //we will need to override .equals method
    override fun equals(other: Any?): Boolean {
        if(this ===other){
            return true
        }

        if(other is Userx){
            return this.firstName == other.firstName
                    && this.lastName == other.lastName
                    && this.age== other.age
        }
        return false
    }

    override fun toString(): String {
        return "User(firstName='$firstName',lastName='$lastName',age=$age)"
    }
}