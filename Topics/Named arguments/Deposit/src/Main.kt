import kotlin.math.pow

fun depositCalculator(amount: Int = 1000, yearlyPercent: Double = 5.0, years: Int = 10) =
    (amount * (1 + yearlyPercent / 100).pow(years)).toInt()

fun main() {
    // write your code here
    when (readln()) {
        "amount" -> println(depositCalculator(amount = readln().toInt()))
        "percent" -> println(depositCalculator(yearlyPercent = readln().toDouble()))
        "years" -> println(depositCalculator(years = readln().toInt()))
        else -> println("Fix the input!")
    }
}