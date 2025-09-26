fun main(){

}

class App : A by FirstDelegate(),B by SecondDelegate(){
    override fun print() {

    }

    override fun print2() {

    }
}

interface A{
    fun print()
}

interface B{
    fun print2()
}


class FirstDelegate : A{
    override fun print(){

    }
}

class SecondDelegate : B{
    override fun print2() {

    }
}