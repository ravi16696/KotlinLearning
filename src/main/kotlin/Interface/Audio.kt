package Interface

class Audio : Downloader, Player {
    override val downloaderName: String
        get() = "audio downloader"

    override fun download() {
        println("download Audio")
    }

    override val playerInfo: String
        get() = "audio player"

    override fun play() {
        println("play audio")
    }

    override fun test() {
        super<Downloader>.test()
    }

}