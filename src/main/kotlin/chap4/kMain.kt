package chap4


fun main() {

    sayHello("joy")
    sayHello(null)


}

fun sayHello(name: String?) {
    println("hello" + (name ?: "unknown"))
}

fun useRead() {
    val n = readInt()
    if (n != null) {
        println(n + 1)
    } else {
        println("no val")
    }
}

fun readInt() = readLine()?.toInt()?.toString(16)

fun personMaker() {
    val person = Person()
    person.firstName = "JOY"
    person.familyName = "World"
    person.age = 27

    person.showMe()

    val per2 = Person.Person("hello", "kotlin", 22)
    println(per2.fullName)
    println(per2.firstName)
    println(per2.familyName)
    println(per2.age)
}