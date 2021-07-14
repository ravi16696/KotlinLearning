package Classes

class Box() {

    var length: Int = 0
    var breadth: Int = 0
    var height: Int = 0

    init {
        println("init block")
    }

    constructor(length: Int,breadth: Int, height: Int) : this()  {
        this.length = length
        this.breadth = breadth
        this.height = height
    }

    constructor(name: String, length: Int, breadth: Int, height: Int) : this(length, breadth, height) {
        println("secondary constructor called")
        this.boxName = name;
    }

    /*
    public - it is default and available everywhere
    internal - it is available under same module
    protected - it is available under child class
    private - it is available in the same file or class
     */
    var volume = 0
        get() = length * breadth * height
    set(value) {
        println("setting volume $value")
        field = 30
    }

    var boxName : String = "Classes.Box Name"
    set(value) {
        if(value.length < 5) {
            println("Cannot set box name")
        } else {
            field = value
        }
    }

    fun open() {
        println("Message: " + "open")
    }

    fun fillContent() {
        println("Message: " + "Filling content")
    }

}