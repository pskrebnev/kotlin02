package org.example.org.experiments

import java.math.BigDecimal
import java.util.*
import kotlin.random.Random

fun main(args: Array<String>) {
    var result: Any

    val randomNumber = Random.nextInt(3)
    if (randomNumber == 1) {
        result = BigDecimal(30)
    } else {
        result = "Hello"
    }

    println("Currently result is $result")

    if (result is BigDecimal) {
        result = result.add(BigDecimal(20))
    } else {
        var tempResult =  result as String
        result = tempResult.uppercase(Locale.getDefault())
    }

    println("Currently result is $result")
}