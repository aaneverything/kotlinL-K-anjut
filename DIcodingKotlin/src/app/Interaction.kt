package app

interface Interaction {
    val name : String
    //konkret function
    fun sayHello(name : String){
        println("helo $name, my name is ${this.name} ")
    }
}

class Human(override val name: String) : Interaction{

    //bisa juga diatas anunya
//    override fun sayHello(name: String) {
//       println("helo $name, my name is ${this.name} ")
//    }
}