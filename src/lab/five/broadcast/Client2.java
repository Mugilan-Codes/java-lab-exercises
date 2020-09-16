package lab.five.broadcast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class Client2 {

    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(3456, InetAddress.getByName("localhost"));
        socket.setBroadcast(true);

        while (true) {
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String str = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Server: " + str);
            if (str.equalsIgnoreCase("bye...")) {
                break;
            }

        }
        socket.close();

    }
}
