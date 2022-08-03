package chap5

fun main() {


    println(aggregate(intArrayOf(1,2,3,45)) { result, op -> result * op })
}

fun aggregate(numbers: IntArray, op: (Int, Int) -> Int): Int {
    //:?는 null일경우 우측 default값 주는 것 엘비스
    var result = numbers.firstOrNull() ?: throw IllegalArgumentException("empty array")
    for(i in 1..numbers.lastIndex) result = op(result,numbers[i])
    return result
}