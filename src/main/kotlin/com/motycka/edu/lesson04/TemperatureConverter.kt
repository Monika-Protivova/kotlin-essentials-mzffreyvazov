package com.motycka.edu.lesson04

import io.github.oshai.kotlinlogging.KotlinLogging

private val logger = KotlinLogging.logger { }

/**
 * Utility object for converting temperature values between Fahrenheit and Celsius
 */
object TemperatureConverter {

    /**
     * Converts temperature value given in Fahrenheit to Celsius
     *
     * @param fahrenheit temperature value in Fahrenheit
     * @return temperature value in Celsius
     *
     * The conversion formula is:
     *   Celsius = (Fahrenheit - 32) * 5 / 9
     * @see <a href="https://en.wikipedia.org/wiki/Fahrenheit">Fahrenheit</a>
     * @see <a href="https://en.wikipedia.org/wiki/Celsius">Celsius</a>
     */
    fun toCelsius(fahrenheit: Double): Double {
        logger.info { "Converting $fahrenheit Fahrenheit to Celsius" }
        return (fahrenheit - 32) * 5 / 9
    }

    /**
     * Converts temperature value given in Celsius to Fahrenheit
     *
     * @param celsius temperature value in Celsius
     * @return temperature value in Fahrenheit
     * @see <a href="https://en.wikipedia.org/wiki/Fahrenheit">Fahrenheit</a>
     * @see <a href="https://en.wikipedia.org/wiki/Celsius">Celsius</a>
     */
    fun toFahrenheit(celsius: Double): Double {
        logger.info { "Converting $celsius Celsius to Fahrenheit" }
        return celsius * 9 / 5 + 32
    }

}


fun main() {
    TemperatureConverter.toFahrenheit(34.0).also(::println)
    TemperatureConverter.toCelsius(94.0).also(::println)
}
