package anonymousInnerClass

class Downloader {

    constructor() {
        listner = object : DownloadListner {
            override fun onStartDownload() {
                println("Download started")
            }

            override fun onDownloadInprogress(progress: Int) {
                println("Downloading .... ${progress * 10}%")
            }

            override fun onDownloadComplete(file: String) {
                println("download completed - $file")
            }

        }
    }

    private val listner : DownloadListner
    fun downloadfile(file : String) {
        listner.onStartDownload()
        for (i in 1..10) {
            Thread.sleep(1000)
            listner.onDownloadInprogress(i)
        }
        listner.onDownloadComplete(file)
    }
}