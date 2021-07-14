package Interface

class Video : Downloader, Player {
    override val downloaderName: String
        get() = "video downloader"

    override fun download() {
        println("downloading video")
    }

    override val playerInfo: String
        get() = "video player"

    override fun play() {
        println("playing video")
    }

    override fun test() {
        super<Downloader>.test()
    }
}