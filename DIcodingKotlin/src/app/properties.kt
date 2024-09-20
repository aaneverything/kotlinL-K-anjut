import app.brand

class Car {
    //propertiees
    var brand : String = ""
    var model : String = ""
    var speed : Int = 0
}

fun main(){
    val car = Car()
    car.brand = "wuling"
    println(car.brand)
}