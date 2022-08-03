package chap5

import chap5.TestPer.Companion.parsePerson

fun main() {
    with(Per23("John","what")){
        Add1("lon","don","213").post("hello")
    }

    println("Joy World".parsePerson()?.firName)
    println("Joy World".parsePerson()?.famName)
}



class Add1(val city:String , val street:String , val house:String)

class Per23(val firstName :String,val familyName :String){
    fun Add1.post(message:String){
        println("message$message , $firstName $familyName ${this.city} ${this.house} ${this.street}")
    }
}


class TestPer(val firName :String , val famName:String){
    companion object{
        fun String.parsePerson() : TestPer? {
            val names=split(" ")
            return if(names.size ==2)TestPer(names[0],names[1]) else null
        }
    }
}