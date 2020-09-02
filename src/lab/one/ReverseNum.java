package lab.one;

import java.util.Scanner;

public class ReverseNum {
    static int reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to be reversed: ");
        int num = input.nextInt();

        System.out.println("Reversed Number = " + reverseNumber(num));
    }
}

// Output:

// Enter a number to be reversed: 123456
// Reversed Number = 654321