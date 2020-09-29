package lab.six;

import java.util.Scanner;

public class ReverseString {

    public static void reversePrintString(String str) {
        System.out.println("Original String: " + str);

        String[] tokens = str.split(" ");

        for (int i = tokens.length - 1; i > -1 ; i--) {
            System.out.println(tokens[i]);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Print String in Reverse Order");
        System.out.print("Enter the String: ");
        String str = in.nextLine();

        reversePrintString(str);

    }

}
