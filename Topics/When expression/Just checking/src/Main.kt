fun main() {
    // write your code here
    val userInput = readln()
    when {
        userInput.length < 5 -> println("${userInput.length}")
        else -> println("Unknown number")
    }
}