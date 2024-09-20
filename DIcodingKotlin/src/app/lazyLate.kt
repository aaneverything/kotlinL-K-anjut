package app

//lateint : jikalau tidak mau menginisialisasi nilainya duluan
lateinit var brand : String

//lazy prop : sama aja sih sama lateint
val ras : String by lazy {
    "kontong"
}

fun main(){
    //lazy_oh
    println(ras)

    //lateint
    brand = "xiaomi"
    println(brand)

    if (::brand.isInitialized)
        println(brand.length)
    else
        println("oh oh")
}