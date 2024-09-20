package classCollect

//filter and filterNot
//filter dan filter note itu kebalikanya
val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val evenList = numberList.filterNot { it % 2 == 0 } //it representasi masing masing item

//map
val numberList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val multipliedBy5 =
    numberList2.map { it * 5 } //Fungsi ini akan membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya

//count
val numberList3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) //sum nilai di list
fun sum() {
    print(numberList3.count())
}

fun countSum() {
    print(numberList.count { it % 3 == 0 })
}


//find(), firstOrNull(), & lastOrNull()
val numberList5 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val firstOddNumber = numberList5.find { it % 2 == 1 }
val firstOrNullNumber = numberList5.firstOrNull { it % 2 == 3 }
fun callIt() {
    println(firstOddNumber)
    println(firstOrNullNumber)
}

//first and last
val numberList6 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val first = numberList6.first()
val last = numberList6.last()
fun callHim() {
    println(first)
    println(last)
}

//sum
val numberList7 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val sam = numberList7.sum()


//sorted
val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
val ascendingSort = kotlinChar.sorted()
val descendingSort = kotlinChar.sortedDescending()


fun main() {
    // println(evenList)
    // println(multipliedBy5)
    // sum()
    // countSum()
    // callIt()
    // callHim()
// println(sam)
    println(ascendingSort)
    println(descendingSort)
}