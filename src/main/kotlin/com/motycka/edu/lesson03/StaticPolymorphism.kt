package com.motycka.edu.lesson03


/*
 Implement an object called AreaCalculator with the following methods:
 - fun calculateRectangleArea(a: Double, b: Double): Double
 - fun calculateRectangleArea(a: Int, b: Int): Double
 - fun calculateCircleArea(r: Double): Double
 - fun calculateCircleArea(r: Int): Double
 - fun calculateTriangleArea(a: Double, b: Double): Double
 - fun calculateTriangleArea(a: Int, b: Int): Double

 The class demonstrates static polymorphism by providing multiple methods with the same name but different parameter types (Int and Double).
 The check will tolerate 0.001 inaccuracy.
 */

object AreaCalculator {

    fun calculateRectangleArea(a: Double, b: Double): Double {
        return a * b
    }

    fun calculateRectangleArea(a: Int, b: Int): Double {
        return a.toDouble() * b.toDouble()
    }

    fun calculateCircleArea(r: Double): Double {
        return Math.PI * r * r
    }

    fun calculateCircleArea(r: Int): Double {
        return Math.PI * r.toDouble() * r.toDouble()
    }

    fun calculateTriangleArea(a: Double, b: Double): Double {
        return 0.5 * a * b
    }

    fun calculateTriangleArea(a: Int, b: Int): Double {
        return 0.5 * a.toDouble() * b.toDouble()
    }

}



/*
 Uncomment the main function to try the solution.
 */

fun main() {
    println(AreaCalculator.calculateRectangleArea(5, 10))
}
