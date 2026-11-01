package lab_sheet_8.Q19;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileDownloader {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.example.com/sample.txt");
        URLConnection connection = url.openConnection();
        connection.setConnectTimeout(10000);
        connection.setReadTimeout(10000);

        if (connection instanceof HttpURLConnection) {
            HttpURLConnection httpConnection = (HttpURLConnection) connection;
            int status = httpConnection.getResponseCode();
            if (status < 200 || status >= 300) {
                httpConnection.disconnect();
                throw new IOException("Download failed with HTTP status " + status);
            }
        }

        Path destination = Paths.get("downloaded_sample.txt");
        try (InputStream input = connection.getInputStream()) {
            Files.copy(input, destination, StandardCopyOption.REPLACE_EXISTING);
        }

        System.out.println("Downloaded file to: "
                + destination.toAbsolutePath());
    }
}
