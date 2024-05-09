// NumberTypes/Task4.kt
package numberTypesExercise4

fun convertToMilliseconds(hours: Int, minutes: Int, seconds: Int): Long =
    60 * 60 * 1_000L * hours + 60 * 1_000L * minutes + 1_000L * seconds

fun main() {
    println(convertToMilliseconds(1, 30, 0))
}