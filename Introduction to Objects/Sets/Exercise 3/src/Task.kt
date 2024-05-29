// Sets/Task3.kt
package setsExercise3
import atomictest.eq

val meats = setOf("beef", "chicken")
val fruits = setOf("apple", "orange", "banana", "kiwi")
val vegetables = setOf("beans", "peas", "carrots", "sweet potatoes", "asparagus", "spinach")

// countPercent

fun percentMeat(groceryCart: Set<String>): Double =
  100.0 * groceryCart.intersect(meats).size / groceryCart.size

fun percentFruit(groceryCart: Set<String>): Double =
  100.0 * groceryCart.intersect(fruits).size / groceryCart.size

fun percentVeggies(groceryCart: Set<String>): Double =
  100.0 * groceryCart.intersect(vegetables).size / groceryCart.size

fun percentOther(groceryCart: Set<String>): Double =
  100.0 * groceryCart.subtract(meats.union(fruits).union(vegetables)).size / groceryCart.size

fun main() {
  val groceryCart = setOf("apple", "pretzels", "bread", "orange", "beef",
    "beans", "asparagus", "sweet potatoes", "spinach", "carrots")

  percentMeat(groceryCart) eq 10.0
  percentFruit(groceryCart) eq 20.0
  percentVeggies(groceryCart) eq 50.0
  percentOther(groceryCart) eq 20.0
}