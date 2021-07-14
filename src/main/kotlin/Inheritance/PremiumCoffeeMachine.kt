package Inheritance

import CoffeeMachine

class PremiumCoffeeMachine(
    private val price1 : Int,
    private val name1 : String
): CoffeeMachine(name1, price1) {

    fun makeCappuccino() {
        println("make cappuccino")
        makeCoffee()
    }
}