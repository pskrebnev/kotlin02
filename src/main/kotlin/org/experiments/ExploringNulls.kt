package org.example.org.experiments

import java.util.Locale

fun main(args: Array<String>) {
    var er: String? = null
//    er = "Matt"
    println("${er!!.uppercase(Locale.getDefault())}")
    var myInt: Int? = 7
    myInt = null
}