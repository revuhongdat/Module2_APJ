package exercise_proxy_pattern;

import java.io.File;

public class FileDownloaderProxy implements Downloader{

    @Override
    public void download(String URL, String fileDestination) {
        FileDownloader fileDownloader = new FileDownloader("Firefox");
        fileDownloader.download(URL,fileDestination);
    }
}
