package anonymousInnerClass

interface DownloadListner {

    fun onStartDownload()
    fun onDownloadInprogress(progress : Int)
    fun onDownloadComplete(file : String)

}