package lab.five.broadcast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Clients extends Thread {
    final DataInputStream dis;
    final DataOutputStream dos;
    final Socket s;

    public Clients(Socket s, DataInputStream dis, DataOutputStream dos) {
        this.s = s;
        this.dis = dis;
        this.dos = dos;
    }

    public void run() {
        String receives;
        while (true) {
            try {
                dos.writeUTF("Write anything ... Type Exit to terminate " +
                        "connection");
                receives = dis.readUTF();
                if (receives.equals("Exit")) {
                    System.out.println("Client  " + this.s + "  has sent exit" +
                            " ... ");
                    System.out.println("Terminating connection");
                    this.s.close();
                    System.out.println("Closed Connection");
                    break;
                }
                dos.writeUTF(receives);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            this.dis.close();
            this.dos.close();
        } catch (Exception a) {
            a.printStackTrace();
        }
    }
}

public class ThreadServer {

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        ServerSocket ss = new ServerSocket(5056);
        while (true) {
            Socket s = null;
            try {
                s = ss.accept();
                System.out.println("A new client is connected :: " + s);
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos =
                        new DataOutputStream(s.getOutputStream());
                System.out.println("Assigning new thread for this client");
                Thread t = new Clients(s, dis, dos);
                t.start();
                String msg;
                System.out.println("Server Message = :: ");
                msg = sc.nextLine();
                dos.writeUTF(msg);
            } catch (Exception e) {
                s.close();
                e.printStackTrace();
            }
        }
    }

}
