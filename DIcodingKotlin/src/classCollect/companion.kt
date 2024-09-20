package classCollect

class App(val name:String){
    companion object{
        fun toUpper(name:String):String{
            return name.toUpperCase()
        }
    }
}

fun main(){
    println(App.toUpper("janabadra"))
    // Panggil fungsi add tanpa membuat instance
}


//mendefinisikan fungsi atau properti yang dapat diakses secara langsung dari kelas, tanpa membuat instance dari kelas tersebut.