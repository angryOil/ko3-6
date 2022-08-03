package chap5

fun main() {
    println( indexOf(intArrayOf(423,2,12,5,76)){it<3})
}


inline fun indexOf(numbers: IntArray, condition: (Int) -> Boolean): Int {
    for (i in numbers.indices) {
        if(condition(numbers[i]))  return numbers[i]
    }
    return -1
}