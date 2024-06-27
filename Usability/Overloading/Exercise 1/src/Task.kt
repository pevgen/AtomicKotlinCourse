// Overloading/Task1.kt
package overloadingExercise1

// Implement class Dog
class Dog {
    fun bark(n: Int) {
        for (i in 1..n) {
            println("woof")
        }
    }

    fun bark(n: Int, say: String) {
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