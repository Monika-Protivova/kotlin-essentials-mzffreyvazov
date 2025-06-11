package com.motycka.edu.lesson03.model

import kotlin.math.PI

/*
 Implement Circle class that implements Shape2D and Ellipse interfaces.

    - It should have a constructor that takes one parameter for the radius.
    - It should override all methods from Shape2D and Ellipse interfaces.
 */

class Circle(override val radius: Double) : Shape2D, Ellipse {

    override fun area(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }

    override fun to3D(): Shape3D {
        return Sphere(radius)
    }
}
