package classCollect

interface anonymous {
    fun action()
}

fun fireAction(action: anonymous){
    action.action()
}

class SampleAction : anonymous {
    override fun action() {
        println("le kecepatan")
    }
}

fun main(){
    fireAction(SampleAction())
    fireAction(object : anonymous {
        override fun action() {
            println("action")
        }
    })
}