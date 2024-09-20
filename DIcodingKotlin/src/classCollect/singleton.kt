package classCollect


//singleton hanya mempunyai satu instance
object singleton {
    val name : String = "My singleton ohohoh"

    fun toUpper(value: String): String {
        return value.uppercase()
    }
}


fun main(){
    println(singleton.toUpper("joko widodo"))
    println(singleton.toUpper(singleton.name))
}

// secara otomatis memiliki satu instance di seluruh aplikasi.