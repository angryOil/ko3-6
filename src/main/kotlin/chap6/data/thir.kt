package chap6.data

import kotlin.random.Random

fun main() {
    val th1 = newThir()
    val th1Fir = th1.fir
    val th1Fam = th1.family
    val th1Age = th1.age
    val (fir, family, age) = th1

    println("fir ${fir.uppercase()} fam $family age $age")
    if (th1Age < 18) {
        println("$th1Fir $th1Fam is under-age $th1Age")
    }else{
        println("${th1Fir} $th1Fam is over-age $th1Age")
    }
}

fun newThir() = Thir(
    readLine()!!,
    readLine()!!,
    Random.nextInt(100)
)


data class Thir(val fir:String, val family: String, val age: Int)