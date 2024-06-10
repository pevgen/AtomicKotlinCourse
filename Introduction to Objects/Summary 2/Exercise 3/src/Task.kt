// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*

class FixedSizeHolder(val maxSize: Int) {
    var size : Int = 0
        get() = field

    val full : Boolean
        get() = size == maxSize

    public fun add(obj : Any) {
        if (full) {
            throw IllegalStateException("The container is full");
        }
        size++;
    }

}

fun main() {

  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"

}