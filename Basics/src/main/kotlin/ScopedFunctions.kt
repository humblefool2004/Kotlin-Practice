fun main(){
    //1. let → transformation & null safety
    val name: String? = "Saheel"

    val length = name?.let {
        println("The name is $it")
        it.length
    }

    println(length) // 6

   // 2. run → operate & return a result
    val greeting = "Hello".run {
        this + " Saheel"
    }
    println(greeting) // Hello Saheel

   // 3. with → multiple operations
    val list = mutableListOf(1, 2, 3)

    val result = with(list) {
        add(4)
        add(5)
        size  // returns 5
    }
    println(result)

  //  4. apply → configure objects
 /*   val user = User("Saheel", 21).apply {
        age = 22
        println("Configuring user $name")
    }
    println(user) // returns the User itself*/

   // 5. also → side effects
    val numbers = mutableListOf(1, 2, 3).also {
        println("List before adding: $it")
    }.also {
        it.add(4)
    }
    println(numbers) // [1, 2, 3, 4]
}