package app

abstract class Animal(var name : String, var sikil : Int){
    fun eat(){
        println("$name is madang rait no")
    }
}

class Lion(name: String, sikil: Int) : Animal(name,sikil)

fun main(){
    val lion = Lion("kucing", 4)
    lion.eat()

}