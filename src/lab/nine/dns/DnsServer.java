package lab.nine.dns;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DnsServer {

    public static void main(String[] args) throws IOException {

        System.out.println("Creating Server: 5000");
        DatagramSocket socket = new DatagramSocket(5000);
        byte[] receiveData = new byte[1024];
        byte[] sendData = new byte[1024];
        String msg;
        InetAddress ip = InetAddress.getLocalHost();
        while (true) {
            DatagramPacket response = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(response);
            String rvMsg = new String(response.getData(), 0, response.getLength());
            System.out.println("Message Received from Client: " + rvMsg);
            System.out.println("Send message to Client:" + "Host:" + response.getAddress() + ", Port:" + response.getPort());
            msg = "Ok From " + ip.getHostAddress() + ":5000";
            sendData = msg.getBytes();
            DatagramPacket client = new DatagramPacket(sendData, sendData.length, response.getAddress(), response.getPort());
            socket.send(client);

            if (rvMsg.equalsIgnoreCase("exit")) {
                break;
            }

        }

    }

}
