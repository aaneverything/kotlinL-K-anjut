package classCollect

fun hello(value : String, transformer :(String) -> String): String{
    return "hallo ${transformer(value)}"
}


fun main(){
//    val lamdaUpper = {value:String -> value.toUpperCase()}
//    println(hello("bangsat", lamdaUpper))


    val total = listOf(1, 2, 3, 4, 5, 6)
    val result1 = total.take(5)
    val result2 = result1.takeLast(4)
    val result3 = result2.drop(1)
    val result4 = result3.dropLast(2)
    println(result4)
}