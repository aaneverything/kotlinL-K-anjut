package classCollect

class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    val dataUser5 = dataUser.copy(age = 18) //copy
    println(user.equals(dataUser))
    println(dataUser.equals(dataUser2))
    println(user)
    println(dataUser)

    //destructuring
    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old")
}

