package lab.nine.dns;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class DnsClient {

    public static void main(String[] args) throws IOException {

        System.out.println("Connected to Server: 5000");
        DatagramSocket socket = new DatagramSocket();
        byte sendData[] = new byte[1024];
        byte revData[] = new byte[1024];
        String msg;
        InetAddress ip = InetAddress.getLocalHost();

        while (true) {
            System.out.print("Send message to server:");
            msg = new Scanner(System.in).nextLine();
            sendData = msg.getBytes();
            DatagramPacket client = new DatagramPacket(sendData, sendData.length, ip, 5000);
            socket.send(client);

            DatagramPacket response = new DatagramPacket(revData, revData.length);
            socket.receive(response);
            String rvMsg = new String(response.getData(), 0, response.getLength());
            System.out.println("Message Received from server: " + rvMsg);
            if (msg.equalsIgnoreCase("exit") || rvMsg.equalsIgnoreCase("exit")) {
                break;
            }

        }

    }

}
