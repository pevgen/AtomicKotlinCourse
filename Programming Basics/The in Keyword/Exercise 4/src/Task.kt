// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter
fun isValidStartCharacter(ch: Char): Boolean = ch in 'a'..'z' || ch in 'A'..'Z' || ch == '_'
fun isValidCharacterOfId(ch: Char): Boolean = isValidStartCharacter(ch) || (ch in ('0'..'9'))

fun isValidIdentifier(s: String): Boolean {
  val startChar = s[0];
  if (!isValidStartCharacter(startChar)) {
    return false
  }
  for (c in s) {
    if (!isValidCharacterOfId(c)) {
      return false
    }
  }
  return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}