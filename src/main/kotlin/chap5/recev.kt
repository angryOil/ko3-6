package chap5

fun main() {
    val re = sum(intArrayOf(1))
    println(re)
    val min1:Int.(Int) -> Int = {if(this<it)this else it}
    val min2: (Int ,Int) -> Int = min1
    println(3.min1(2))
    println(min1(4,2))
}


fun aggre(nums: IntArray, op: Int.(Int) -> Int): Int {
    var result = nums.firstOrNull() ?: throw IllegalArgumentException("Empty arr")
    for (i in 1..nums.lastIndex) result = result.op(nums[i])
    return result
}

fun sum(nums: IntArray) = aggre(nums) { op -> println("this ${this} op ${op}")
    op +this}