package chap4

class Person {
    var firstName : String = ""
    var familyName : String = ""
    var age : Int = 0

    private fun fullName() = firstName+familyName

    fun showMe(){
        println("${fullName()}:${age}")
    }

    class Person( val firstName :String ,val familyName:String , val age :Int){

        val fullName = firstName + familyName

        init {
            println("created new Person instance: ${fullName}")
        }
    }
}
