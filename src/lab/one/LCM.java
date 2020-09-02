package lab.one;

import java.util.Scanner;

public class LCM {
    static int findLCM(int n1, int n2) {
        int lcm = Math.max(n1, n2);

        while(true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                return lcm;
            }
            ++lcm;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + findLCM(num1, num2));
    }
}

// Output:
// 
// Enter first number: 96
// Enter second number: 54
// GCD of 96 and 54 is 864