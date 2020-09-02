package lab.one;

import java.util.Scanner;

public class NumberPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the power: ");
        int exponent = input.nextInt();

        double result = Math.pow(num, exponent);

        System.out.println(num + " to the power of " + exponent + " = " + result);
    }
}

// Output:

// Enter the number: 2
// Enter the power: 3
// 2 to the power of 3 = 8.0