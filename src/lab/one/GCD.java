package lab.one;

import java.util.Scanner;

public class GCD {
    static int findGCD(int n1, int n2) {
        while (n1 != n2) {
            if(n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        return n1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        num1 = (num1 > 0) ? num1 : -num1;
        num2 = (num2 > 0) ? num2 : -num2;

        System.out.println("GCD of " + num1 + " and " + num2 + " is " + findGCD(num1, num2));
    }
}

// Output
// 
// Enter first number: 20
// Enter second number: 28
// GCD of 20 and 28 is 4