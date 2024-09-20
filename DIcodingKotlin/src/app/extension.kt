package app
//extension function
class Student(val name: String, val age: Int)
class Mahasiswa(val name : String, val age: Int)

fun Student.sayHellow(name: String) {
    println("halo $name, nama saya ${this.name} umur saya $age")
}


//null function extension
fun Mahasiswa?.sayHello(name: String) {
    if (this != null) {
        println("halo $name, nama saya ${this.name} umur saya $age")
    }
}

//extension properties
val Student.upperName : String
    get() = this.name.toUpperCase()


fun main() {
    val student = Student("aan", 17)
    student.sayHellow("konci")


    println(student?.upperName)
}