package lab.four.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class ExceptionAA extends Exception {
    ExceptionAA() {
        super("This is from Exception AA");
    }

    ExceptionAA(String s) {
        super(s);
    }
}

class ExceptionAB extends ExceptionAA {
    ExceptionAB() {
        super("This is from Exception AB");
    }
}

public class ProgramFive {
    public static void main(String[] args) {
        try{
            throw new ExceptionAB();
        } catch (Exception e) {
            System.out.println("ExceptionAB is thrown");
            e.printStackTrace();
        }

        try {
            throw new ExceptionAA();
        } catch (Exception e) {
            System.out.println("ExceptionAA is thrown");
            e.printStackTrace();
        }

        try {
            String str = null;
            System.out.println(str.toString());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        try{
            File file = new File("checkText.txt");
            FileReader fr = new FileReader(file.getAbsoluteFile());
            System.out.println(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
