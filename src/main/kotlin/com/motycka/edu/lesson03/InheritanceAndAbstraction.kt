package com.motycka.edu.lesson03

import com.motycka.edu.lesson03.model.Circle
import com.motycka.edu.lesson03.model.Rectangle
import com.motycka.edu.lesson03.model.Square

/*
 Uncomment the main function to try the solution.
 */

fun main() {
    val rectangle = Rectangle(2.0, 3.0)
    println("Rectangle area: ${rectangle.area()}")
    println("Rectangle perimeter: ${rectangle.perimeter()}")

    val square = Square(5.0)
    println("Square area: ${square.area()}")
    println("Square perimeter: ${square.perimeter()}")

    val cube = square.to3D(square.width)
    println("Cube volume: ${cube.volume()}")
    println("Cube surface area: ${cube.surfaceArea()}")

    val cuboid = rectangle.to3D(4.0)
    println("Cuboid volume: ${cuboid.volume()}")
    println("Cuboid surface area: ${cuboid.surfaceArea()}")

    val circle = Circle(4.0)
    println("Circle area: ${circle.area()}")
    println("Circle perimeter: ${circle.perimeter()}")

    val sphere = circle.to3D()
    println("Sphere volume: ${sphere.volume()}")
    println("Sphere surface area: ${sphere.surfaceArea()}")
}
