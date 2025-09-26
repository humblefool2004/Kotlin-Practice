fun main(){
    val name1= "Saheel"
    val name2= "Saheel"


    //structural equality . internally it calls .equals() method
    println(name1==name2)
    //referential equality. checks the reference, if name2 points to the same object, it will give true
    println(name1 === name2)
}
