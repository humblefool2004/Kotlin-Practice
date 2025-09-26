fun main(){
    val listView = ListView(arrayOf("Name 1","Name 2", "Name 3", "Name 4"))
    listView.ListViewItem().displayItem(2)
}

class ListView(val items : Array<String>){
    // the inner class have access to all the properties of the outer class
    inner class ListViewItem(){
        fun displayItem(position : Int){
            println(items[position])
        }
    }
}