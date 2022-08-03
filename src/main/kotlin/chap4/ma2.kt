package chap4

fun main() {
    returnTest("null")
    fun midPoint(xRange : IntRange , yRange: IntRange) = object {
        val x = (xRange.first + xRange.last)/2
        val y = (yRange.first + yRange.last)/2
    }
    val midP = midPoint(1..123,223..444)
    println("${midP.x} ")
}



fun returnTest(initVal : String?) {
    val check = initVal ?: return
    println("check: $check")
}

fun property() {
    val per2 = Per2("moo","yaho")
    per2.age = 12
    println(per2.age)
}


class Per(private val firName: String, private val family: String){
    val full : String
        get() : String{
            return firName + family
        }

}