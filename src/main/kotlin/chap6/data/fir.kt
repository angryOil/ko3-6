package chap6.data


fun main() {
    val box1 = Mailbox("UNKNOWN", Person("joy", "World", 23))
    val box2 = Mailbox("UNKNOWN", Person("joy", "World", 23))
    println(box1 == box2)
    println(box2)
}

data class Person(val firstName: String, val familyName: String, val age: Int)


data class Mailbox(val address: String, val person: Person)