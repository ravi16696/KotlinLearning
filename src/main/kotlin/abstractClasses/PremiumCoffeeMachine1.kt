package abstractClasses

class PremiumCoffeeMachine1(
    private val price : Int,
    private val color : String
) : BaseCoffeeMachine(price, color){
    override val brand: String
        get() = "premium coffee machine"

    override fun makecoffee(): String {
        return "your $brand is ready"
    }

}