import java.lang.NumberFormatException

fun main(){

    println(parseIntNum("10000000000"))
}

fun parseIntNum (s : String): Int{
    var num = 0
    if(s.length !in 1..31) throw NumberFormatException("Not a num :${s}")
    for (c in s) {
        if(c !in '0'..'1') throw NumberFormatException("not a num :${s}")
        println("c:${c-'0'}")
        num = num*2 + (c-'0')
    }
    return num
}

fun indexOf(subarray: IntArray, arr: IntArray): Int {
    outerLoop@ for (i in arr.indices) {
        for (j in subarray.indices) {
            if(subarray[j] != arr[i+j]) continue@outerLoop
        }
        return i
    }
    return -1
}

fun loo5() {
    val result = countLetters("aabcdasdffsadfsad")
    println()

    for (ch in result.indices) {
        println(('a'+ch) +":${result[ch]}")
    }
}

fun countLetters(text: String ):IntArray{
    val counts = IntArray('z'-'a'+1)

    for(char in text){
        val charLower =  char.lowercaseChar()
        if (charLower !in 'a'..'z') continue
        counts[charLower-'a']++
        print(charLower)
        print(counts[charLower-'a'])
    }
    return counts
}

fun loop4Practice() {
    val num = 44
    while (true) {
        val guess = readLine()!!.toInt()
        val message =
            if (guess < num) "Too small"
            else if (guess > num) "to Big"
            else break
        println(message)
    }
    println("right ${num}")

}