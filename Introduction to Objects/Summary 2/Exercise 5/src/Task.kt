// Summary2/Task5.kt
package summaryIIExercise5

fun va1(vararg par1: Int) {
    println("va1:")
    for (i in par1) {
        println("$i")
    }
}

fun va2(vararg par2: Int) {
    println("va2:")
    va1(*par2)
}

fun main() {

  va1(1, 2, 3)
  va2(4, 5, 6)

}
/* Expected output:
va1:
1
2
3
va2:
va1:
4
5
6
 */