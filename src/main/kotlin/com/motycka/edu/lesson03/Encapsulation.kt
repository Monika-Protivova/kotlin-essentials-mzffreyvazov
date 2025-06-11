package com.motycka.edu.lesson03

import java.time.LocalDate

/*
  TODO implement the Assignment class.

  The class should have the following public properties:
    - `dueDate` of type `LocalDate` - should be public, immutable and initialized in the constructor
    - `assignee` of type `String` - should be public, immutable and initialized in the constructor

  And the following private property:
    - `finalGrade` of type `Int?` (nullable) - should be private, mutable and initialized to null

  And the following methods:
    - `setFinalGrade(grade: Int)`: sets the finalGrade for the assignment, but only if it is between 0 and 100 (inclusive).
      Use: require(finalGrade in 0..100) { "Final grade must be between 0 and 100" }
    - `getFinalGrade()`: returns the finalGrade for the assignment.
 */
class Assignment(
    val dueDate: LocalDate,
    val assignee: String
) {
    private var finalGrade: Int? = null

    fun setFinalGrade(grade: Int) {
        require(grade in 0..100) { "Final grade must be between 0 and 100" }
        finalGrade = grade
    }

    fun getFinalGrade(): Int? {
        return finalGrade
    }
}
/*
 Uncomment the main function to try the solution.
 */

fun main() {
    val assignment = Assignment(LocalDate.now(), "John Doe")
    assignment.setFinalGrade(90)
    println(assignment.getFinalGrade())
}
