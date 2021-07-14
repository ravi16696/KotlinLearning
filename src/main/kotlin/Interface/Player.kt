package Interface

interface Player {

    val playerInfo : String
    fun play()
    fun getPlayerInfo() {
        println("play info - $playerInfo")
    }

    fun test() {
        println("this is player test")
    }
}