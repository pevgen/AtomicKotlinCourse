// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b+ c

fun main() {
  sum(0,0,0) eq 0
  sum(1,0,0) neq 0
  sum(1,-1,2) eq 2
  sum(0,1,-5) neq -5
  sum(100,-99,-2) eq -1
}