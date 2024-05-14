// Summary1/Task5.kt
package summaryIExercise5

fun everyFifth(start: Int, end: Int) {
    var i = 0
    val length = end - start
    while (i <= length) {
        i++
        if (i % 5 == 0) {
            println(start + i - 1)
        }
    }
}

fun main() {
    everyFifth(11, 30)
}
/* Output:
15
20
25
30
*/