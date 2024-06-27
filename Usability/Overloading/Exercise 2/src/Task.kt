// Overloading/Task2.kt
package overloadingExercise2

class Dog {
    fun bark(n: Int, say: String = "woof") {
        for (i in 1..n) {
            println(say)
        }
    }
}

fun main() {

  val dog = Dog()
  dog.bark(3)
  dog.bark(2, "wow")

}
/* Expected output:
woof
woof
woof
wow
wow
 */