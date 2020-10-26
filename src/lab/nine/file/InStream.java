package lab.nine.file;

import java.io.File;
import java.io.FileWriter;

public class InStream {

    public static void main(String[] args) {

        String text = "This is a sentence that is entered using instream. \n by giving appropriate write permissions for the user to insert and output the data";

        try {
            File file = new File("src/lab/nine/file/input.txt");
            file.setWritable(true);
            System.out.println("Access Granted!.");
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            System.out.println("Written Successfully!");
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
