package com.motycka.edu.lesson04

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class TemperatureConverterTest : StringSpec({

    "convert Celsius to Fahrenheit where celsius is 0" {

        val celsius = 0.0
        val fahrenheit = TemperatureConverter.toFahrenheit(celsius)

        fahrenheit shouldBe 32.0
    }

    "convert Celsius to Fahrenheit where celsius is 100" {

        val celsius = 100.0
        val fahrenheit = TemperatureConverter.toFahrenheit(celsius)

        fahrenheit shouldBe 212.0
    }

    "convert Fahrenheit to Celsius where fahrenheit is 32" {

        val fahrenheit = 32.0
        val celsius = TemperatureConverter.toCelsius(fahrenheit)

        celsius shouldBe 0.0
    }

    "convert Fahrenheit to Celsius where fahrenheit is 212" {

        val fahrenheit = 212.0
        val celsius = TemperatureConverter.toCelsius(fahrenheit)

        celsius shouldBe 100.0
    }

    "convert Fahrenheit to Celsius where fahrenheit is 98.6" {

        val fahrenheit = 98.6
        val celsius = TemperatureConverter.toCelsius(fahrenheit)

        celsius shouldBe (37.0 plusOrMinus 0.001)
    }

    "convert Fahrenheit to Celsius where fahrenheit is negative" {

        val fahrenheit = -4.0
        val celsius = TemperatureConverter.toCelsius(fahrenheit)

        celsius shouldBe -20.0
    }
})
