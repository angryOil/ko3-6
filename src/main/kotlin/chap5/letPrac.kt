package chap5

fun main() {
    Address2("London","strreety","21").let {
        println("To city:${it.city}")
        it.post("hello")
    }
    Address2("suk","han","133").let { addr->
        println("add ${addr.city}")
        addr.post("world")
    }
}


class Address2(val city: String, val street: String,val house:String){
    fun post(message:String){}
}