package lab.six;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseString {

    public static void reversePrintString(String str) {
        System.out.println("\nOriginal String: " + str);

        String[] tokens = str.split(" ");

        Collections.reverse(Arrays.asList(tokens));

        StringBuilder reversed = new StringBuilder();

        for (String string : tokens) {
            reversed.append(string).append(" ");
        }

        System.out.println("\nReversed String: " + reversed);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Print String in Reverse Order");
        System.out.print("Enter the String: ");
        String str = in.nextLine();
        reversePrintString(str);

    }

}
