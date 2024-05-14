// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(p1 :Int,p2 : Int ) : Int = p1 + p2

fun g(p1 : String, p2: String) : String = p1 + p2

fun h() : Unit = println("h()")

fun main() {
  val v1 : Int = f(1,2)
  val v2 : String = g("","")
  val v3 : Unit = h()
  println("Int")
  println("String")
  println("Unit")


}