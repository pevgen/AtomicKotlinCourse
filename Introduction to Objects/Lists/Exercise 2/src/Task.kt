// Lists/Task2.kt
package listsExercise2

fun countOccurrences(list: IntList, number: Int): Int {
  var result = 0
  for (num in list) {
    if (num == number) {
      result++;
    }
  }
  return result
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  println(countOccurrences(list, 2))  // 2
}