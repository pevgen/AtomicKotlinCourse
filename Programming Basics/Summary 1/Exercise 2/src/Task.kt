// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var result = ""
  var i = 0
  for (ch in s) {
    if (i % 2 == 0) {
      result += ch
    }
    i++
  }
  return result
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/