// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var result : String = ""
  for (v in 'a'..'z') {
    result += v
  }
  return result
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}