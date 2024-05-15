// ObjectsEverywhere/Task3.kt
package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
    s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
    isPalindrome(s.lowercase())

fun isLetter(ch: Char): Boolean = ch in 'a'..'z' || ch in 'A'..'Z'

fun isPalIgnoreSpecial(s: String): Boolean {
    var newString = ""
    for (ch in s) {
        if (isLetter(ch)) {
            newString += ch
        }
    }
    return isPalIgnoreCase(newString)
}

fun main() {
    println(isPalIgnoreSpecial("AAA!"))  // true
    println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}