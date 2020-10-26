package lab.nine.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

    public static void main(String[] args) throws IOException {

        String fileName = "src/lab/nine/file/input.txt";
        String line;
        int count = 0;

        File file = new File(fileName);
        // FileReader fileReader = new FileReader("input.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        while ((line = reader.readLine()) != null) {
            String[] words = line.split(" ");
            count += words.length;
        }

        System.out.println("No. of words in `" + file.getName() + "` is " + count);
        reader.close();

    }

}
