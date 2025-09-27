fun main() {
    upperCase("hello"){s -> s.uppercase()}
    // the above can be shortened using it keyword (applicable to single parameter lambda)
    upperCase("Kaddu"  ){it.uppercase()  }
}

fun upperCase(str: String,muFunction: (String) -> String){
    val uppercasedWord = muFunction(str)
    println(uppercasedWord)
}