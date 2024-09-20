package app


class Person(var firstName: String, var lastName: String = "sucipto") {

    //properties
    var firstname: String = firstName
    var lastname: String = lastName

    var fullname = firstname + " " + lastname

    init {
        println(fullname)
    }
}


//memanggil constructor dari class Person
fun main(){
    val manusia = Person("latep", "simanjuntak")

}
