package lab.five.chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static int PORT = 2345;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", PORT);
        System.out.println("Connection Established");
        DataInputStream inputStream;
        Scanner in = new Scanner(System.in);
        DataOutputStream outputStream;

        while (true) {
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());

            System.out.println();
            System.out.print("You: ");
            String message = in.nextLine();
            outputStream.writeUTF(message);

            if(message.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                inputStream.close();
                outputStream.close();
                socket.close();
                break;
            }

            System.out.println("Server: " + inputStream.readUTF());
        }

        System.out.println("Exited.");

    }
}
