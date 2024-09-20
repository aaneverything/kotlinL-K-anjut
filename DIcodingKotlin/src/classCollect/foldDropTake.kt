package classCollect

//fold
val numbers = listOf(1, 2, 3)
val fold = numbers.fold(10) { current, item ->
    println("current $current")
    println("item $item")
    println()
    current + item
}

//take
val total = listOf(1, 2, 3, 4, 5, 6)
val take = total.take(3)
val lst = total.takeLast(3)


//drop
val number = listOf(1, 2, 3, 4, 5, 6)
val drop = number.drop(3)
val dropl = number.dropLast(3)

fun main() {
    // println("Fold result: $fold")
//    println(take)
//    println(lst)
//    println(drop)
//  println(dropl)

}
