package lab_sheet_8.Q16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class MessageSender {
    public static void main(String[] args) throws Exception {
        InetAddress serverAddress = InetAddress.getByName("localhost");
        byte[] message = "Ping".getBytes(StandardCharsets.UTF_8);
        DatagramPacket packet = new DatagramPacket(
                message, message.length, serverAddress, 6000);

        try (DatagramSocket socket = new DatagramSocket()) {
            socket.send(packet);
            System.out.println("Sent: Ping");
        }
    }
}
