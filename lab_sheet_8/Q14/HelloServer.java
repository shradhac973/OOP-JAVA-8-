package lab_sheet_8.Q14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class HelloServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("HelloServer waiting on port 5000...");
            try (Socket client = server.accept();
                 BufferedReader input = new BufferedReader(new InputStreamReader(
                         client.getInputStream(), StandardCharsets.UTF_8))) {
                System.out.println("Client connected");
                String message = input.readLine();
                if (message != null) {
                    System.out.println("Received from client: " + message);
                }
            }
        }
    }
}
