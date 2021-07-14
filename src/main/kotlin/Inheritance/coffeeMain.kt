import Inheritance.PremiumCoffeeMachine

fun main() {
    val coffeeMachine = PremiumCoffeeMachine(12, "specialCoffee")
    coffeeMachine.makeCappuccino()
    coffeeMachine.makeCoffee()

    val coffeeMachine1 = CoffeeMachine("simple", 5)
    coffeeMachine1.makeCoffee()
}