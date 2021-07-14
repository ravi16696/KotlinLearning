import Classes.Box

fun main() {
    println("Hello word")

    val box = Box()
    box.height = 2
    box.length = 5
    box.volume = 30
    box.boxName = "raasdfasdfa"
    println("Classes.Box length " + "${box.length}")
    println("Classes.Box heigh ${box.height}")
    println("Volume ${box.volume}")

    val box1 = Box("raasdf", 23, 32, 23)
    val box2 = Box(23, 23, 23)
    println("box1 anme ${box1.boxName}")
    println("box1 volume ${box1.volume}")
    box.open()
    box.fillContent()

}
