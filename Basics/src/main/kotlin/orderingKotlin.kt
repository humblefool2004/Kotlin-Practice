fun main() {
    val numbers= mutableListOf<Int >(2,5,1,40,20,100,60)
    numbers.sorted().forEach{println(it)}

    val laptops = mutableListOf(
        Laptop("Dell",2021,4,600),
        Laptop("Acer",2020,8, 800),
        Laptop("Apple",2022,2, 1000)
    )
    println()
    laptops.sorted().forEach { println(it) }
    println()

    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
    println()
    laptops.sortedWith(ComparatorYear()).forEach { println(it) }

    //here its a lot of lines of code, to shorten this, we use lamdda expressions
    println()
    laptops.sortedWith(compareBy<Laptop> { it.price }).forEach { println(it) }
    // the above single line does the samething that we did explicitely
    // more shorter way is below
    println()
    laptops.sortedBy{it.ram}.forEach { println(it) }

    //benefit of the sortedWith
    // laptops.sortedWith(compareBy<Laptop>{it.year}.thenBy {it.price}).forEach{println(it)}
}

data class Laptop(val brand: String, val year: Int,val ram : Int,val price : Int) : Comparable<Laptop>{
    override fun compareTo(other: Laptop): Int {
        return if(this.price > other.price){
            println("In if statement : Swapping ${this.brand} with ${other.brand}")
            1
        } else if(this.price<other.price){
            println("In if statement : Swapping ${this.brand} with ${other.brand}")
            -1
        }
        else 0
    }
}

class ComparatorRam : Comparator<Laptop>{
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if(laptop1.ram > laptop2.ram){
            1
        }else if(laptop1.ram < laptop2.ram){
            -1
        }else 0
    }
}

class ComparatorYear : Comparator<Laptop>{
    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
        return if(laptop1.year > laptop2.year){
            1
        }else if(laptop1.year < laptop2.year){
            -1
        }else 0
    }
}
