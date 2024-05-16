// Properties/Task3.kt
package propertiesExercise3

class Robot {
    var x = 0
    var y = 0
    private val maxSize = 100

    private fun crossBoundary(value: Int): Int {
        val newVal = value % maxSize
        if (newVal < 0) {
            return maxSize + newVal
        } else {
            return newVal
        }
    }

    fun right(steps: Int) {
        x += steps
        x = crossBoundary(x)
    }

    fun left(steps: Int) {
        x -= steps
        x = crossBoundary(x)
    }

    fun down(steps: Int) {
        y += steps
        y = crossBoundary(y)
    }

    fun up(steps: Int) {
        y -= steps
        y = crossBoundary(y)
    }

    fun getLocation(): String = "($x, $y)"
}

fun main() {
    val robot = Robot()
    robot.left(130)
    println(robot.getLocation())
    robot.up(1)
    println(robot.getLocation())
    robot.left(10)
    println(robot.getLocation())
}
/* Output:
(0, 0)
(0, 99)
(90, 99)
*/