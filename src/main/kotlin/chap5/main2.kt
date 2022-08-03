package chap5

fun main() {
    val consume = StringConsumer { s-> println(s*s) }
    consume.accept(223)

    val lessThen = {a:Int , b:Int -> a<b }
    println(lessThen(33,2))

    val less2 = {a:Int , b:Int -> a*b}

}

fun measureTime(action: () -> Unit):Long{
    val start = System.nanoTime()
    action()
    return System.nanoTime() - start
    
}

fun interface StringConsumer {
    fun accept(i:Int)
}