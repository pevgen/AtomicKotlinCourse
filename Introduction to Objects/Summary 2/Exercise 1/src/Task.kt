// Summary2/Task1.kt
package summaryIIExercise1
import atomictest.eq

class Boring {
    fun a(): Double = 1.618
    fun b(): String = "ratio"
    fun c(): Int = 11
}

fun main() {
    val boring = Boring()
    boring.a() eq 1.618
    boring.b() eq "ratio"
    boring.c() eq 11
}