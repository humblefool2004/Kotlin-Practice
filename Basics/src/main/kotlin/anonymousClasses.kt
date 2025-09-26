import java.awt.Button

fun main(){
    // val clicklistener= ClickListener()
    // val loginButton = Button("Login",1233,clicklistener)
    // val signUpButton = Button("Sign Up",23432,clicklistener)
    val loginButton= Button("Login",1232,object : OnClickListener{
        override fun onClick() {
            //login the user
        }
    })

    val signUpButton = Button("Sign Up",23432, object : OnClickListener {
        override fun onClick() {
            //signup the user
        }
    })
}


class Button(val text: String,val id: Int, onClickListener: OnClickListener)
/*class ClickListener() : OnClickListener{
    override fun onClick() {
        //doing something
    }
}*/
interface OnClickListener{
    fun onClick()
}