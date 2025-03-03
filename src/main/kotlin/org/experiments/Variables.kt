package org.example.org.experiments

fun main(args: Array<String>){
//    println("Fine tuning car")
//    var strVal: String = "Boomba"
//    val scrumba = "Bommba Durumba"
//    println("$scrumba Name is $strVal")
//    println("${scrumba.length} name is $strVal")

    var multiLine =
        """
            Multi line string
            Bottom to Top
            Rise Up
        """.trimIndent()

    println(multiLine.replaceAfterLast("Rise Up", "Rise Farun"))
}