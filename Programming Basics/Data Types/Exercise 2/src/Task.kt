// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  val result1 = int + double
  val result2 = string + double + int

  // Can't be combined:
  // val result3 = int + boolean
  // val result4 = double + boolean
  // val result5 = character + double


  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")


}