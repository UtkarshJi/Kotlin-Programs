import java.util.Scanner
class Solution{
fun romanToInt(s: String): Int {
    val romanMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var prevValue = 0

    for (char in s.reversed()) {
        val value = romanMap[char] ?: 0

        if (value < prevValue) {
            result -= value
        } else {
            result += value
        }

        prevValue = value
    }

    return result
}

fun main() {
    val scanner = Scanner(System.`in`)

    val romanNumeral = scanner.nextLine()

    val integer = romanToInt(romanNumeral)
    println("$integer")
}
}
