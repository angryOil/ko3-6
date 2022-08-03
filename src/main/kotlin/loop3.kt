fun main() {
    val a = IntArray(10){it * it}
    var sum = 0
    for (x in a) {
        sum += x
    }
    println("sum:${sum}")
    for (x in 0 until  5) {
        println("x:${x}")
    }

    val n = IntArray(10){it * it}

    for (i in 0..n.lastIndex) {
        if(i %2 ==0) n[i] *=2
        println(n[i])
    }
    for (i in 0..n.lastIndex) {
    }
}