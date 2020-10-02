package lab.six;

import java.util.Scanner;

public class StringReplace {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Sentence: ");
        String str1 = in.nextLine();

        String newStr = str1.replaceAll("This", "the");
        newStr = newStr.replace("$", "&");
        newStr = newStr.replaceAll("stars", "Chocolates");
        System.out.println("First sentence after Replacing : \n" + newStr);

        System.out.print("\nEnter Second Sentence: ");
        String str2 = in.nextLine();

        newStr = str2.replaceAll("[12]", "digit");
        newStr = newStr.replaceAll("[A-D]", "Alphabet");
        System.out.println("Second sentence after Replacing : \n" + newStr);

    }

}
