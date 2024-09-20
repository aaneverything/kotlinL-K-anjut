package classCollect

// contoh
// val lambdaName: (ParameterType) -> ReturnType = { parameter -> body }


fun main(){
    val iniLam : (String, String) -> String = {firstname : String, lastname : String ->
        val result = "$firstname $lastname"
        result
    }

    val ranges = 1.rangeTo(10) step 3
    ranges.forEach {
        value -> println("value is $value!") }


    val result = iniLam("anjing", "babi")
    println(result)
}