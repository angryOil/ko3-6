package chap5

fun main() {
    val person = Person3("Joy", "World")
    val readName = person::firstName.getter
    val writeFamily = person::familyName.setter

    println(readName())
    writeFamily("modify")
    println(person.familyName)
    println(person.fullName)
}

class Person3(var firstName :String, var familyName:String){
    inline val fullName
    get() = "$firstName $familyName"

}
