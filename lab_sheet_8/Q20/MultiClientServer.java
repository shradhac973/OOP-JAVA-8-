package lab_sheet_8.Q20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;

public class MultiClientServer {
    private static final int PORT = 5000;
    private static final AtomicInteger CLIENT_NUMBER = new AtomicInteger(1);

    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("MultiClientServer listening on port " + PORT + "...");

            while (true) {
                Socket client = server.accept();
                String threadName = "Client-" + CLIENT_NUMBER.getAndIncrement();
                Thread clientThread = new Thread(
                        () -> handleClient(client), threadName);
                clientThread.start();
            }
        }
    }

    private static void handleClient(Socket client) {
        try (Socket socket = client;
             BufferedReader input = new BufferedReader(new InputStreamReader(
                     socket.getInputStream(), StandardCharsets.UTF_8))) {
            String message = input.readLine();
            if (message != null) {
                System.out.println("[" + Thread.currentThread().getName()
                        + "] Received: " + message);
            }
        } catch (IOException exception) {
            System.err.println("[" + Thread.currentThread().getName()
                    + "] Client connection failed: " + exception.getMessage());
        }
    }
}
