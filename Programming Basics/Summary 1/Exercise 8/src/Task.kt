// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
    var worker = number
    var result = 0
    while (worker > 0) {
        result = result * 10 + worker % 10
        worker = worker / 10
    }
    return result
}

fun main() {
    println(reverseDecimal(1234))  // 4321
}