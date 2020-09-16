package lab.five.sysinfo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static int PORT = 7654;

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", PORT);
        System.out.println("Connection Established.");

        DataInputStream inputStream =
                new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream =
                new DataOutputStream(socket.getOutputStream());
        Scanner in = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 - Get Current Date\n2 - Get Current " +
                    "Time\n3 - Get the IP Address\nOther numbers to Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();

            outputStream.writeInt(choice);

            String response = inputStream.readUTF();

            if (response.equalsIgnoreCase("exit")) {
                System.out.println("Exiting...");
                inputStream.close();
                outputStream.close();
                socket.close();
                break;
            }

            System.out.println(response);

        }

        System.out.println("Server Exited.");

    }

}
