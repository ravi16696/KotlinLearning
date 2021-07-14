import delegationPattern.Downloader
import delegationPattern.Player

class VideoMediaDownloader(private val file : String) : Downloader {
    override fun download() {
        println("downloaded $file")
    }

}

class VideoMediaPlayer(private val file : String) : Player {
    override fun play() {
       println("playing $file")
    }

}
class MediaFile(
    private val downloader: Downloader,
    private val player: Player
) : Downloader by downloader, Player by player {
    //delegation pattern
//    override fun download() {
//        downloader.download()
//    }
//
//    override fun play() {
//        player.play()
//    }

}

fun main() {
    val file = MediaFile(VideoMediaDownloader("file.mp4"), VideoMediaPlayer("file.mp4"))
    file.download()
    file.play()
}