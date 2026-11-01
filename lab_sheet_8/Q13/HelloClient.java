package lab_sheet_8.Q13;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class HelloClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 5000);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true,
                     StandardCharsets.UTF_8)) {
            output.println("Hello Server");
            System.out.println("Message sent to server.");
        }
    }
}
