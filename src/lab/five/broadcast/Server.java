package lab.five.broadcast;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) throws IOException {

        InetAddress IP = InetAddress.getByName("localhost");
        DatagramSocket socket = new DatagramSocket();
        System.out.println("Socket Created.");
        Scanner in = new Scanner(System.in);
        DatagramPacket packet;

        while (true) {
            System.out.print("Enter a message: ");
            String message = in.nextLine();
            byte[] buf;

            if (message.equalsIgnoreCase("exit")) {
                System.out.println("Shutting down server...");
                buf = "Bye...".getBytes();
                packet = new DatagramPacket(buf, buf.length, IP, 3456);
                socket.send(packet);
                break;
            }

            buf = message.getBytes();

            packet = new DatagramPacket(buf, buf.length, IP, 3456);

            socket.send(packet);
        }

        socket.close();
    }

}
