package chap6.data

fun main() {
    val paris = arrayOf(2 to "one" to "2" to "1" to 2, 1 to "two", 3 to "three")
    for ((fir, sec) in paris) {
        println("$fir $sec")
    }
    val d1 = DataThir("jo", "wo")
    val d2 = DataThir("hello", "world")
    println(combine(d1, d2) { text, data -> "$text ${data.sec}" })
    println(combine(d1, d2) { text, (fir) -> "$text $fir" })
    println(combine(d1, d2) { text, (data, data2) -> "$text $data ${data2}" })
}


data class DataThir(val fir: String, val sec: String)

fun combine(
    d1: DataThir, d2: DataThir, folder: ((String, DataThir) -> String)
): String {
    return folder(folder("", d1), d2)
}