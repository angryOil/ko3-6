package chap4

class Per2(val firstName: String, val familyName: String) {

    var age: Int? = null
        set(value) {
            if (value != null && value <= 0) {
                throw IllegalArgumentException("invalid age : $value")
            }
            field = value
        }

}