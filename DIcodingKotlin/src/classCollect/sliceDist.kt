package classCollect

//slice
val totall = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val slice = totall.slice(3..6)


//distinct
val total2 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
val distinct = total2.distinct()//menyaring item yang sama


//chunked
val word = "QWERTY"
val chunked = word.chunked(3) //memecah string



fun main() {
    // println(slice)
    println(chunked)

}