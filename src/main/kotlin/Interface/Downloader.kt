package Interface

interface Downloader {

    val downloaderName : String
    fun download()
    fun getDownloaderInfo() {
        println("this is $downloaderName")
    }

    fun test() {
        println("this is downloader test")
    }
}