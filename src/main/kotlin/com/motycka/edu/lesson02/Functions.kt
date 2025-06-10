package com.motycka.edu.lesson02

val coffeeOrders = mutableMapOf<Int, List<String>>()

fun main() {
//    try {
//        processOrder(listOf(ESPRESSO, CAPPUCCINO, CAPPUCCINO, AMERICANO), 20.0)
//        processOrder(listOf(ESPRESSO, FLAT_WHITE, AMERICANO), 10.0)
//        processOrder(listOf(ESPRESSO, ESPRESSO, LATTE), 5.0) // will fail due to insufficient payment
//    } catch (e: IllegalStateException) {
//        println("Error processing order: ${e.message}")
//    }
}

fun getPrice(item: String): Double = when (item) {
    ESPRESSO -> ESPRESSO_PRICE
    CAPPUCCINO -> CAPPUCCINO_PRICE
    LATTE -> LATTE_PRICE
    AMERICANO -> AMERICANO_PRICE
    FLAT_WHITE -> FLAT_WHITE_PRICE
    else -> 0.0
}

fun placeOrder(items: List<String>): Int {
    val orderId = (coffeeOrders.keys.maxOrNull() ?: -1) + 1
    coffeeOrders[orderId] = items
    return orderId
}

fun payOrder(orderId: Int): Double {
    val items = coffeeOrders[orderId]
        ?: throw IllegalStateException("Order ID $orderId not found.")

    val prices = items.map { getPrice(it) }
    var total = prices.sum()

    if (items.size >= 3) {
        total -= prices.minOrNull() ?: 0.0
    }
    return total
}

fun completeOrder(orderId: Int) {
    if (!coffeeOrders.containsKey(orderId)) {
        throw IllegalStateException("Order ID $orderId not found.")
    }
    coffeeOrders.remove(orderId)
}

fun processOrder(items: List<String>, payment: Double): Double {
    val orderId = placeOrder(items)
    val totalToPay = payOrder(orderId)

    if (payment < totalToPay) {
        throw IllegalStateException("Insufficient payment. Total to pay is $totalToPay, but received $payment.")
    }

    val change = payment - totalToPay

    println("Payment successful. Total paid: $payment, Total to pay: $totalToPay, change: $change")
    completeOrder(orderId)
    return change
}