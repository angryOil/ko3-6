package chap6.enums

fun main() {
    println(WeekDay.MONDAY.isWorkDay())
    println(WeekDay.SUNDAY.name)
    println(RainbowColor.RED.isCold)
    println(RainbowColor.BLUE.isCold)
    println(RainbowColor.GREEN.ordinal)
    println(WeekDay.SUNDAY.nextDay)
    val weekDays = enumValues<WeekDay>()
    println(weekDays[2])
    println(weekDays[4])
    println(enumValueOf<WeekDay>("MONDAY"))
}


enum class WeekDay{
    MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY,SATURDAY , SUNDAY;
    val lowerCaseName get() = name.lowercase()
    fun isWorkDay() = this == SATURDAY||this == SUNDAY

}
val weekDays = WeekDay.values()
val WeekDay.nextDay get() = weekDays[(ordinal+1)%weekDays.size]
enum class RainbowColor(private val isWarm: Boolean){
    RED(true) , ORANGE(true) , YELLOW(true),
    BLUE(false) , GREEN(false),INDIGO(false),VIOLET(false);
    val isCold get() = !isWarm

}