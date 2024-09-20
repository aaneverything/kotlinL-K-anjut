package classCollect

typealias Arithmetic = (Int, Int) -> Int
// typealias Arithmetic = ((Int, Int) -> Int)?

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
val multiply: Arithmetic = { valueA, valueB ->
    valueA * valueB
}
val sumResult = sum(10, 10)
val multiplyResult = multiply(20, 20)

fun vall(){
    println(sumResult)
    println(multiplyResult)
}

fun main() {
    // kalau tanpa typealias
    // val sum : (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }
    vall()

}