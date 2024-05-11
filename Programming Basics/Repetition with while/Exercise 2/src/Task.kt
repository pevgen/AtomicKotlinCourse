// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun condition (i : Int, number: Int) = i <= number

fun sum(number: Int): Int {
  var sum = 0
  var i = 0;
  while (condition(i,number)) {
    sum += i
    i++
  }
  return sum
}

fun main() {
  println(sum(10))  // 55
}