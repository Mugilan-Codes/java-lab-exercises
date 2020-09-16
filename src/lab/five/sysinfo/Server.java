package lab.five.sysinfo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {

    private static ServerSocket serverSocket;
    private static int PORT = 7654;

    public static void main(String[] args) throws IOException {

        serverSocket = new ServerSocket(PORT);
        System.out.println("Waiting for the client...");

        Socket socket = serverSocket.accept();
        System.out.println("Connection Established.");

        DataInputStream inputStream= new DataInputStream(socket.getInputStream());
        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

        while (true) {
            int choice = inputStream.readInt();
            System.out.println("Client: " + choice);
            String message = "";

            if (choice == 1) {
                System.out.println("Getting Current Date");
                String date = new SimpleDateFormat("MMM dd, yyyy").format(new Date());
                message = "Current Date: " + date;
                System.out.println(message);
            } else if (choice == 2) {
                System.out.println("Getting Current Time");
                String time = new SimpleDateFormat("hh:mm:ss a").format(new Date());
                message = "Current Time: " + time;
                System.out.println(message);
            } else if (choice == 3) {
                System.out.println("Getting IP Address");
                InetAddress host = InetAddress.getLocalHost();
                message = "IP Address is " + host.getHostAddress();
                System.out.println(message);
            } else {
                System.out.println("Shutting Down Server...");
                outputStream.writeUTF("exit");
                inputStream.close();
                outputStream.close();
                socket.close();
                break;
            }

            outputStream.writeUTF(message);

        }

        System.out.println("Shutting down socket server...");
        serverSocket.close();

    }

}
