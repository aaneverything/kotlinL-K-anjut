package classCollect


//sama kaya class biasanya cuma ini kaya konstant gitu kaya kelamin cuma 2, mata angin ada 4 dll
enum class enumm {

    male,
    female
}

fun main(){
    val man = enumm.male
    val woman = enumm.female

    val allGenders: Array<enumm> = enumm.values()

    println(man)
    println(woman)
    println(allGenders.toList())
}
