package exercise_proxy_pattern;

public class Client {
    public static void main(String[] args) {
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download("URL", "fileDestination");
    }
}
