package lab.six;

import java.util.Scanner;

public class PrintCaseString {

    private static void printChangedCase(String str) {
        System.out.println("\nGiven String: " + str);
        System.out.println("Uppercase String: " + str.toUpperCase());
        System.out.println("Lowercase String: " + str.toLowerCase());
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Print Given string in Upper and Lower Cases");
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        printChangedCase(str);
    }

}
