package lab_sheet_8.Q12;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
    public static void main(String[] args) throws IOException {
        try (ServerSocket server = new ServerSocket(5000)) {
            System.out.println("HelloServer waiting on port 5000...");
            try (Socket client = server.accept()) {
                System.out.println("Client connected");
            }
        }
    }
}
