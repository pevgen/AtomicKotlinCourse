// Lists/Task1.kt
package listsExercise1
import atomictest.eq

fun findMax(list: IntList): Int {
  if (list.size() == 0) {
    return 0
  }
  return list.sorted()[list.size() - 1]
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}