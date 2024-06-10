// Summary2/Task2.kt
package summaryIIExercise2

import atomictest.eq

class Boring2(val _a: Double, val _b: String, val _c: Int) {

    fun a() = _a
    fun b() = _b
    fun c() = _c
}

fun main() {
    val boring = Boring2(1.618, "ratio", 11)
    boring.a() eq 1.618
    boring.b() eq "ratio"
    boring.c() eq 11
}