// Summary2/Task8.kt
package summaryIIExercise8
import atomictest.eq

val romanNumeralToIntMap: Map<String, Int> =
  mapOf(
    "M" to 1000,
    "D" to 500,
    "C" to 100,
    "L" to 50,
    "X" to 10,
    "V" to 5,
    "I" to 1
  )

fun convertFromRoman(roman: String): Int {
  var result = 0
  var prevDigit = -1
  for (letter in roman.reversed()) {
    val curDigit = romanNumeralToIntMap[letter.toString()]
    if (curDigit != null) {
      if (curDigit >= prevDigit) {
        result += curDigit
        prevDigit = curDigit
      } else {
        result -= curDigit
      }

    }
  }
  return result
}

fun main() {
  convertFromRoman("XXIII") eq 23
  convertFromRoman("XLIV") eq 44
  convertFromRoman("C") eq 100
  convertFromRoman("MMXVIII") eq 2018
}