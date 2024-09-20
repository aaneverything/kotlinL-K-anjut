package classCollect

sealed class sealed(val name: String) {

}

class plus : sealed("anjay plus")
class minus : sealed("minus cikk")



fun operation(value1: Int, value2: Int, operation : sealed ) : Int {
    return when(operation) {
        is plus -> value1 + value2
        is minus -> value1 - value2
    }
}

fun main(){
    println(operation(10, 10, plus()))
    println(operation(10, 5, minus()))
}