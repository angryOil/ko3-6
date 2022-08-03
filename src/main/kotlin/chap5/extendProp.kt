package chap5


fun main() {
    println((1..6).leftHalf)
    println((3..8).leftHalf)
    println(intArrayOf(1,2,11,523).midIndex)
    val nums = IntArray(11){it*it}
    println(nums.midValue)
    nums.midValue = 22
    println(nums.midValue)
    val hello = "Hello".message
    val bye = "bye".message
    println(hello == bye)

}


val IntRange.leftHalf: IntRange
    get() = start..(start+endInclusive)/2


val IntArray.midIndex
    get() = lastIndex/2

var IntArray.midValue
    get() = this[midIndex]
    set(value) {
        this[midIndex] = value
    }

val String.message by lazy{"hellow"}