// Testing/Task3.kt
package testingExercise3
import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int) = h / 2.0 * (x + y)

fun main() {
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25

  rectangleArea(0,2) eq 0
  rectangleArea(100,0) eq 0
  rectangleArea(5,6) eq 30

  trapezoidArea(3,4, 1) eq 3.5
  trapezoidArea(1,1, 4) eq 4.0
  trapezoidArea(100,200, 1200) eq 180000.0
}