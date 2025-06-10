package com.motycka.edu.lesson02

fun brewCoffee(coffeeGrams: Double, waterMl: Double, milkMl: Double?, sugarGrams: Double?): String {
    val milkDescription = if (milkMl != null && milkMl > 0) "with milk" else "black"

    val sugarDescription = if (sugarGrams != null && sugarGrams > 0) "sweetened" else "unsweetened"

    return "Coffee ($coffeeGrams g, $waterMl ml) $milkDescription $sugarDescription"
}

fun main() {
    // Example usage of brewCoffee function
    val coffee1 = brewCoffee(coffeeGrams = 10.0, waterMl = 200.0, milkMl = null, sugarGrams = null)
    println(coffee1)

    val coffee2 = brewCoffee(coffeeGrams = 15.0, waterMl = 250.0, milkMl = 50.0, sugarGrams = 5.0)
    println(coffee2)

    val coffee3 = brewCoffee(coffeeGrams = 20.0, waterMl = 300.0, milkMl = null, sugarGrams = 10.0)
    println(coffee3)
}
