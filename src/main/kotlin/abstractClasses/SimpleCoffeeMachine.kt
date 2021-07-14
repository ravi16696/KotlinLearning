package abstractClasses

class SimpleCoffeeMachine(
    private val price : Int,
    private val color: String
) : BaseCoffeeMachine(price, color) {

    override val brand: String
        get() = "SimpleCoffee"

    override fun makecoffee(): String {
       return "Your $brand is ready"
    }

}