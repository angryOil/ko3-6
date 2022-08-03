package chap6.data


fun main() {
    val t1 = DataTest("joy","world").apply { age=22 }
    val t2 = DataTest("joy","world").apply { age=32 }
    println(t1==t2)
    println(t1.show())
    println(t1.age)
    println("-------")
    println(t1.show())
    println("--"+"===")
    println(t1.copy().show())
}


data class DataTest(val fir:String , val family:String){
    var age = 0
}

fun DataTest.show() = println("$fir , $family , age:$age")