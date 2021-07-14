package abstractClasses

abstract class BaseCoffeeMachine(
   private val price : Int,
    private val color : String
) {
    abstract val brand : String

    abstract fun makecoffee() : String

    fun getMachineInfo() : String {
        return "Machine info - \n" +
                "Price - $price \n" +
                "Colour - $color \n"
    }

}