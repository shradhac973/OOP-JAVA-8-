package lab_sheet_8.Q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("EchoServer waiting on port 5000...");
            try (Socket client = server.accept();
                 BufferedReader input = new BufferedReader(new InputStreamReader(
                         client.getInputStream(), StandardCharsets.UTF_8));
                 PrintWriter output = new PrintWriter(client.getOutputStream(), true,
                         StandardCharsets.UTF_8)) {
                String message;
                while ((message = input.readLine()) != null) {
                    System.out.println("Received: " + message);
                    output.println(message);
                }
            }
        }
    }
}
