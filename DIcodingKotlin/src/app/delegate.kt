import kotlin.reflect.KProperty

//delegation
class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

//mendelegate dari class delegate agar ngga setter dan getter satu" di class
class Matkul{
    var name : String by DelegateName()
}

class Mapel{
    var name : String by DelegateName()
}


fun main(){

    val matkul = Matkul()
    matkul.name = "penjas"
    println("Nama mata Kuliah : ${matkul.name}")

    val mapel = Mapel()
    mapel.name = "oh oh oh"
    println("Nama mata Pelajaran : ${mapel.name}")

}