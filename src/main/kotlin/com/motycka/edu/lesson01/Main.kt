package com.motycka.edu.lesson01

/*
    1. Define the main function with args parameter of type Array<String>
    2. Print "Hello, Kotlin!" to the console
    3. Print the program arguments passed to the main function as: "Program arguments: arg1, arg2, ..."
 */
fun main(args: Array<String>) {
    // implementation of the main function
    println("Hello, Kotlin!")
    println("Program arguments: ${args.joinToString(", ")}")
}
