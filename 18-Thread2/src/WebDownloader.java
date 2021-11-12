import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class WebDownloader implements Runnable {
    public static void main(String[] args) {
        downloader("https://img-pre.ivsky.com/img/tupian/pre/202104/21/tiaosan-013.jpg", "1.jpg");
    }

    @Override
    public void run() {

    }

    public static void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}