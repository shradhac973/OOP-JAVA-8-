package lab_sheet_8.Q11;

import java.net.InetAddress;

public class NetworkInfoMain {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("Host name: " + localHost.getHostName());
        System.out.println("IP address: " + localHost.getHostAddress());
    }
}
