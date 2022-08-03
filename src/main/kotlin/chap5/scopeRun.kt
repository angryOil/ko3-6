package chap5

fun main() {
/*    val isReceived = Address().run {
        zipCode = 12354
        city = "Seoul"
        street = "HanChunLo"
        house = "Suk Kye"
        post("this is Message")
    }*/
//    println(isReceived)


    val add = run {
        val zipCode = readLine()?.toInt() ?: return
        val city = readLine() ?: return
        val street = readLine() ?: return
        val house = readLine() ?: return
    }
}


class Address {
    var zipCode: Int = 0
    var city: String = ""
    var street: String = ""
    var house: String = ""

    fun asText() = "$zipCode , $city , $street , $house"

    fun post(message: String): Boolean {
        "Message for {$zipCode , $city , $street , $house}:$message"
        return readLine() == "OK"
    }

}

fun Address.showCityAddress() = println("$street , $house")