package lab.five.multithread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {

    private static String getHeaderURL(InputStream inputStream) {
        String header = "";
        Reader reader = new InputStreamReader(inputStream);
        try {
            int c;
            while ((c = reader.read()) != -1) {
                header += (char) c;
                if (header.contains("\n")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return header;
    }

    public static void main(String[] args) throws IOException {

        int PORT = 2345;
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Listening on PORT " + PORT);

        while (true) {
            try (Socket socket = serverSocket.accept()) {
                InputStream inputStream = socket.getInputStream();
                String val = getHeaderURL(inputStream);
                String[] vals = val.split("/");
                String value = "";
                if (vals.length != 0) {
                    if (vals.length > 1) {
                        value = vals[1].split(" ")[0].trim();
                    }
                }
                String httpResponse = "HTTP/1.1 200 OK\r\n";
                if (value.equalsIgnoreCase("index.html")
                        || value.equalsIgnoreCase("")) {
                    System.out.println("Valid " + value + " " + httpResponse);
                    httpResponse += " Content-Type: text/html \r\n\r\n";
                    BufferedReader f =
                            new BufferedReader(new FileReader(new File("src" +
                                    "/lab/five/multithread/index.html")));
                    String str;
                    while ((str = f.readLine()) != null) {
                        httpResponse += str;
                    }
                    socket.getOutputStream()
                            .write(httpResponse.getBytes(StandardCharsets.UTF_8));
                    socket.getOutputStream().flush();
                    socket.close();
                } else {
                    System.out.println("Invalid Page");
                    httpResponse = "HTTP/1.1 404 \r\n";
                    httpResponse += " Content-Type: text/html \r\n\r\n";
                    BufferedReader f =
                            new BufferedReader(new FileReader(new File("src" +
                                    "/lab/five/multithread/404.html")));
                    String str;
                    while ((str = f.readLine()) != null) {
                        httpResponse += str;
                    }
                    socket.getOutputStream()
                            .write(httpResponse.getBytes(StandardCharsets.UTF_8));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
