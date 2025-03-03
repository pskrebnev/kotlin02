package org.example.org.experiments

import java.math.BigDecimal

fun main(args: Array<String>) {
    var bertran: Double = 253.56
    var bNumber: Int = 56

    var myVar: Float = 25.14f
    var myLong: Long = 58

    var bd = BigDecimal(56_569_88)
    val bd1: BigDecimal = BigDecimal.ONE
    bd1.add(BigDecimal.ONE)

    println("Is the double is double = ${bertran is Double}")
    println("The type is ${bertran::class.simpleName}")
    println("The type is ${bertran::class.qualifiedName}")
    println("The type is ${bertran.javaClass}")
    println("The type is ${bNumber::class.qualifiedName}")
    println("Value is $bd1")


}
