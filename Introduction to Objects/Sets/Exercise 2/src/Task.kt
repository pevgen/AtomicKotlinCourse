// Sets/Task2.kt
package setsExercise2
import kotlin.random.Random

fun experiment(): Int {
  val set = mutableSetOf<Int>()
  var result = 0
  while (set.size < 25) {
    set += Random.nextInt(25) + 1
    result++
  }
  return result
}

fun main() {
  val counts = mutableListOf<Int>()
  repeat(1000) {
    counts += experiment()
  }
  println(counts.average())
}