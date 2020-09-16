package lab.five.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static ServerSocket serverSocket;
    private static int PORT = 2345;

    public static void main(String[] args) throws IOException {
        serverSocket = new ServerSocket(PORT);

        while (true) {
            System.out.println("Waiting for the Client...");
            Socket socket = serverSocket.accept();
            System.out.println("Connection Established.");

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            String message = inputStream.readUTF();
            System.out.println("Client: " + message);

            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            if(message.equalsIgnoreCase("exit")) {
                outputStream.writeUTF("Exiting Server...");
                inputStream.close();
                outputStream.close();
                socket.close();
                break;
            }

            outputStream.writeUTF("Received");
        }

        System.out.println("Shutting Down Socket Server...");
        serverSocket.close();
    }
}
