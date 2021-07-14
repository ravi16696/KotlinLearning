import abstractClasses.PremiumCoffeeMachine1
import abstractClasses.SimpleCoffeeMachine

fun main() {
    val coffeeMachine = SimpleCoffeeMachine(2000, "RED")
    println(coffeeMachine.makecoffee())
    println(coffeeMachine.getMachineInfo())

    val coffeeMachine1 = PremiumCoffeeMachine1(10000, "GREEN")
    println(coffeeMachine1.getMachineInfo())
    println(coffeeMachine1.makecoffee())
}
