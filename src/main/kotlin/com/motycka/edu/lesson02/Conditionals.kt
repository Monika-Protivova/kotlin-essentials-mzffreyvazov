package com.motycka.edu.lesson02


const val ESPRESSO_PRICE = 2.5
const val DOUBLE_ESPRESSO_PRICE = 3.0
const val CAPPUCCINO_PRICE = 3.0
const val LATTE_PRICE = 3.5
const val AMERICANO_PRICE = 2.0
const val FLAT_WHITE_PRICE = 3.2
const val MACCHIATO_PRICE = 2.8
const val MOCHA_PRICE = 3.8


fun conditionals() {
    val coffeeOrders = mapOf(
        1 to listOf(ESPRESSO, CAPPUCCINO, LATTE, AMERICANO),
        2 to listOf(ESPRESSO, DOUBLE_ESPRESSO, FLAT_WHITE)
    )

    fun getPrice(item: String): Double {
        return when (item) {
            ESPRESSO -> ESPRESSO_PRICE
            DOUBLE_ESPRESSO -> DOUBLE_ESPRESSO_PRICE
            CAPPUCCINO -> CAPPUCCINO_PRICE
            LATTE -> LATTE_PRICE
            AMERICANO -> AMERICANO_PRICE
            FLAT_WHITE -> FLAT_WHITE_PRICE
            MACCHIATO -> MACCHIATO_PRICE
            MOCHA -> MOCHA_PRICE
            else -> 0.0
        }
    }

    coffeeOrders.forEach { (orderId, items) ->
        println("Processing Order ID: $orderId")
        println("Items: $items")

        val prices = items.map { getPrice(it) }
        var total = prices.sum()

        // Check if there are 3 or more items to apply a discount
        if (items.size >= 3) {
            println("You ordered 3 or more coffees, you get 1 for free!")
            val minPrice = prices.minOrNull() ?: 0.0
            total -= minPrice
        }

        println("Total price for Order ID $orderId: $total\n")
    }
}

fun main() {
    conditionals()
}