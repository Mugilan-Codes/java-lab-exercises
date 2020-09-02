package lab.one;

import java.util.Scanner;

public class NumOfDigits {
    static int countDigits(int n) {
        String num = Integer.toString(n);
        return num.length();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.println("The Number of digits in " + number + " is " + countDigits(number));
    }
}

// Output:
// 
// Enter the number: 123441243
// The Number of digits in 123441243 is 9