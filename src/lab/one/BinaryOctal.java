package lab.one;

import java.util.Scanner;

public class BinaryOctal {
    static int binaryToOctal(long binaryNumber) {
        int octalNumber = 0, decimalNumber = 0, i = 0;

        while (binaryNumber != 0) {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
            ++i;
            binaryNumber /= 10;
        }

        i = 1;

        while (decimalNumber != 0) {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }
        return octalNumber;
    }

    static long octalToBinary(int octalNumber) {
        int decimalNumber = 0, i = 0;
        long binaryNumber = 0;

        while(octalNumber != 0) {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber /= 10;
        }

        i = 1;

        while(decimalNumber != 0) {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }
        return binaryNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Binary to Octal conversion\n2 - Octal to Binary conversion");
        System.out.print("Choose an Option: ");
        int choice = input.nextInt();

        String result = "";

        switch (choice) {
            case 1:
                System.out.print("Enter the binary number: ");
                long bin = input.nextLong();
                result = bin + " in binary = " + binaryToOctal(bin) + " in octal";
                break;
            case 2:
                System.out.print("Enter the octal number: ");
                int oct = input.nextInt();
                result = oct + " in octal = " + octalToBinary(oct) + " in binary";
                break;
            default:
                System.out.println("Wrong Choice");
        }

        System.out.println(result);
    }
}

// Output:
// 
// 1 - Binary to Octal conversion
// 2 - Octal to Binary conversion
// Choose an Option: 1
// Enter the binary number: 10011100
// 10011100 in binary = 234 in octal
// 
// 1 - Binary to Octal conversion
// 2 - Octal to Binary conversion
// Choose an Option: 2
// Enter the octal number: 234
// 234 in octal = 10011100 in binary