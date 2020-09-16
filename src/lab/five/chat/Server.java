package lab.five.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private static ServerSocket serverSocket;
    private static int PORT = 2345;

    public static void main(String[] args) throws IOException, EOFException {
        serverSocket = new ServerSocket(PORT);
        System.out.println("Waiting for the Client...");
        Socket socket = serverSocket.accept();
        System.out.println("Connection Established.");
        DataInputStream inputStream;
        Scanner in = new Scanner(System.in);
        DataOutputStream outputStream;

        while (true) {
            inputStream =
                    new DataInputStream(socket.getInputStream());
            String message = inputStream.readUTF();
            System.out.println("Client: " + message);

            outputStream =
                    new DataOutputStream(socket.getOutputStream());

            if (message.equalsIgnoreCase("exit")) {
                System.out.println();
//                outputStream.writeUTF("Exiting Server...");
                System.out.println("Exiting Server...");
                inputStream.close();
                outputStream.close();
                socket.close();
                break;
            }

            String outMessage = in.nextLine();
            System.out.println("Server: " + outMessage);
            outputStream.writeUTF(outMessage);
        }

        System.out.println("Shutting Down Socket Server...");
        serverSocket.close();
    }
}
