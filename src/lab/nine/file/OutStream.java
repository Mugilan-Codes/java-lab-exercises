package lab.nine.file;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutStream {

    public static void main(String[] args) {

        String data = "This is added by outstream.";
        try {
            // OutputStream outputStream = new FileOutputStream("output.txt");
            OutputStream outputStream = new FileOutputStream("src/lab/nine/file/output.txt");
            byte[] dataBytes = data.getBytes();
            outputStream.write(dataBytes);
            System.out.println("Data is written to the file.");
            outputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
