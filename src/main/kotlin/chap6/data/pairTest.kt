package chap6.data

fun main() {
    val pair = Pair(1, "two")
    println(pair.first+1)
    println(pair.second)
    val triple = Triple("one",2,false)
    println(triple.first+"1")
    println(triple.second+22)
    println(!triple.third)
}