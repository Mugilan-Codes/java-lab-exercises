package lab.six;

import java.util.Scanner;

public class ThreeLetter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 5 letter word: ");
        String str = in.nextLine();

        for(int i =0; i<str.length();i++) {
            for(int j = 0; j< str.length();j++) {
                for (int k =0; k < str.length();k++) {
                    if (i == j || j == k || k == i) continue;
                    System.out.println(str.charAt(i) + "" + str.charAt(j) + "" + str.charAt(k));
                }
            }
        }

    }

}
