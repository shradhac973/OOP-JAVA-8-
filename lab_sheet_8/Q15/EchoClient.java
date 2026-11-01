package lab_sheet_8.Q15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader console = new BufferedReader(new InputStreamReader(
                     System.in, StandardCharsets.UTF_8));
             BufferedReader input = new BufferedReader(new InputStreamReader(
                     socket.getInputStream(), StandardCharsets.UTF_8));
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true,
                     StandardCharsets.UTF_8)) {
            System.out.print("Enter a message: ");
            String message = console.readLine();
            if (message == null) {
                return;
            }
            output.println(message);
            System.out.println("Echo from server: " + input.readLine());
        }
    }
}
