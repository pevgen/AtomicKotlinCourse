// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
    val with : Int = (rows*columns).toString().length
    for (r in 0 until rows) {
        var intRange = ((r + 1) * columns - 1) downTo r * columns
        if (r % 2 == 0) {
            intRange = r * columns until (r + 1) * columns
        }
        for (c in intRange) {
            print(" %${with}d".format(c))
        }
        println()
    }
}

fun main() {
    showSnake(2, 2)
    println()
    showSnake(2, 3)
    println()
    showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/