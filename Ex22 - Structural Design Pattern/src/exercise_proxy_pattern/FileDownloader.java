package exercise_proxy_pattern;

public class FileDownloader implements Downloader{
    private String UserAgent;

    public FileDownloader(String userAgent) {
        this.UserAgent = userAgent;
    }

    @Override
    public void download(String URL, String fileDestination) {
        System.out.println("File was downloaded from " + URL + " to " + fileDestination + " by " + this.UserAgent);
    }
}
