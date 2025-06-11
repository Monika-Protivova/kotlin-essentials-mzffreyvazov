package com.motycka.edu.lesson03.model

/*
 Implement Cuboid class that implements Shape3D interface.
    - It should have a constructor that takes three parameters for width, height, and depth.
    - It should override all methods from Shape3D interface.
 */
class Cuboid(val width: Double, val height: Double, val depth: Double) : Shape3D {

    override fun volume(): Double {
        return width * height * depth
    }

    override fun surfaceArea(): Double {
        return 2 * (width * height + width * depth + height * depth)
    }
}
