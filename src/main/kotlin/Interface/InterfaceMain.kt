import Interface.Audio

fun main() {
    val audio = Audio()
    audio.download()
    audio.getDownloaderInfo()
    audio.play()
    audio.getPlayerInfo()
    audio.test()
}