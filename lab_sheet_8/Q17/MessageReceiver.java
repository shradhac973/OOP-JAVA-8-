package lab_sheet_8.Q17;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class MessageReceiver {
    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[1024];

        try (DatagramSocket socket = new DatagramSocket(6000)) {
            System.out.println("MessageReceiver waiting on port 6000...");
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            String message = new String(packet.getData(), packet.getOffset(),
                    packet.getLength(), StandardCharsets.UTF_8);
            System.out.println("Received from "
                    + packet.getAddress().getHostAddress() + ": " + message);
        }
    }
}
