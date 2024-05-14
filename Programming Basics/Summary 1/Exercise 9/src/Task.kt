// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
    var sharpCount = 1
    for (i in n - 1 downTo 0) {
        repeat(i) {
            print(" ")
        }
        repeat(sharpCount) {
            print("#")
        }
        println()
        sharpCount += 2
    }
}

fun main() {
    printTriangle(4)
}
/* Output:
   #
  ###
 #####
#######
*/