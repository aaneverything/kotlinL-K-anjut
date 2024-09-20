open class Address(val name : String) {

    fun sayHello(name : String){
        println("hello $name, my name is ${this.name}")
    }
}

//inheritance
class manager(name : String) : Address(name)
class bos(name : String) : Address(name)

//inheritance ada di class address
fun main(){
    val bos = bos("tegar")
    bos.sayHello("fauzi")

    val address = Address("riski")
    address.sayHello("budi")
}