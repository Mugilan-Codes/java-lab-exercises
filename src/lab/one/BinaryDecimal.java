package lab.one;

import java.util.Scanner;

public class BinaryDecimal {
    static long binaryToDecimal(long n) {
        int decimalNumber = 0, i = 0;
        long rem;
        while (n != 0) {
            rem = n % 10;
            n /= 10;
            decimalNumber += rem * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }

    static long decimalToBinary(int n) {
        long binaryNumber = 0;
        int rem, i = 1;
        while(n != 0) {
            rem = n % 2;
            n /= 2;
            binaryNumber += rem * i;
            i *= 10;
        }
        return binaryNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Binary to Decimal conversion\n2 - Decimal to Binary conversion");
        System.out.print("Choose an Option: ");
        int choice = input.nextInt();

        String result = "";

        switch (choice) {
            case 1:
                System.out.print("Enter the binary number: ");
                long bin = input.nextLong();
                result = bin + " in binary = " + binaryToDecimal(bin) + " in decimal";
                break;
            case 2:
                System.out.print("Enter the decimal number: ");
                int dec = input.nextInt();
                result = dec + " in decimal = " + decimalToBinary(dec) + " in binary";
                break;
            default:
                System.out.println("Wrong Choice");
        }

        System.out.println(result);
    }
}

// Output:
// 
// 1 - Binary to Decimal conversion
// 2 - Decimal to Binary conversion
// Choose an Option: 1
// Enter the binary number: 110110111
// 110110111 in binary = 439 in decimal
//
// 1 - Binary to Decimal conversion
// 2 - Decimal to Binary conversion
// Choose an Option: 2
// Enter the decimal number: 439
// 439 in decimal = 110110111 in binary