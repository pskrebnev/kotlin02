package org.example.org.experiments

fun myFunc(arg: String): Unit {
    println(arg)
}

// here is 5.3 is a default number
fun addTwoNumbers(arg1: Double, arg2: Double = 5.3): Double = arg1 + arg2

fun main(arg: Array<String>) {
    myFunc("My name is...")
    println(addTwoNumbers(25.7, 32.8))
    println(addTwoNumbers(25.7))
}




