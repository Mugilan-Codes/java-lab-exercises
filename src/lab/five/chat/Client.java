package lab.five.chat;

import java.io.*;
import java.net.Socket;

public class Client {

    private static int PORT = 2345;

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", PORT);
        System.out.println("Connection Established");
        DataInputStream inputStream;
        BufferedReader reader;
        DataOutputStream outputStream;

        while (true) {
            inputStream = new DataInputStream(socket.getInputStream());
            reader = new BufferedReader(new InputStreamReader(inputStream));

            System.out.print("You: ");
            String message = reader.readLine();

            outputStream = new DataOutputStream(socket.getOutputStream());
            outputStream.writeUTF(message);

            if(message.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                inputStream.close();
                outputStream.close();
                socket.close();
                break;
            }
        }

        System.out.println("Exited.");

    }
}
