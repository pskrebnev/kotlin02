package org.example.org.experiments.makeclass

class Customer(
    val name: String, val address: String, val age: Int
) {
    constructor(name: String, age: Int) : this(name, "", age) {
        println("Secondary constructor")
    }

    init {
        println("Init constructor")
    }
}

class AlternateCustomer(val name: String, var age: Int) {
    var address: String

    init {
        address = ""
    }

    constructor(name: String, address: String, age: Int) : this(name, age) {
        this.address = address
    }
}

class AnotherCustomer(val name: String, val address: String = "", var age: Int) {
    var approved: Boolean = false
        set(value) {
            if (age > 21) {
                field = value
            } else {
                println("You can't approve a customer under 21 years old")
            }
        }
}


fun main() {
    val customer1 = Customer("Matt", "Beverly Hills, 15 - 5", 25)
    println(
        "My name is ${customer1.name}. I live with ${customer1.address}." +
                " I'm ${customer1.age} years old."
    )

    val customer2 = AnotherCustomer("John", age = 54)
    println(
        "My name is ${customer2.name}. I'm ${customer2.age} years old."
    )
}