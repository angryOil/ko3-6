package chap5


fun main() {
    println(evalAtZero {inc(12)})
    println(evalAtZero {dec(12)})
    println( (::dec)(2001))
    println((::max)(1,2))
}
private fun inc(n:Int) = n+1
private fun dec(n:Int) = n-1
private fun evalAtZero(f:(Int)->Int) = f(0)
private fun max(a : Int , b : Int) = if(a>b) a else b