package lab.one;

import java.util.Scanner;

public class DecimalOctal {
    static int decimalToOctal(int n) {
        int octalNumber = 0, i = 1;

        while (n != 0) {
            octalNumber += (n % 8) * i;
            n /= 8;
            i *= 10;
        }
        return octalNumber;
    }

    static long octalToDecimal(int n) {
        int decimalNumber = 0, i = 0;
        while(n != 0) {
            decimalNumber += (n % 10) * Math.pow(8, i);
            ++i;
            n /= 10;
        }
        return decimalNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Decimal to Octal conversion\n2 - Octal to Decimal conversion");
        System.out.print("Choose an Option: ");
        int choice = input.nextInt();

        String result = "";

        switch (choice) {
            case 1:
                System.out.print("Enter the decimal number: ");
                int dec = input.nextInt();
                result = dec + " in decimal = " + decimalToOctal(dec) + " in octal";
                break;
            case 2:
                System.out.print("Enter the octal number: ");
                int oct = input.nextInt();
                result = oct + " in octal = " + octalToDecimal(oct) + " in decimal";
                break;
            default:
                System.out.println("Wrong Choice");
        }

        System.out.println(result);
    }
}

// Output:
//
// 1 - Decimal to Octal conversion
// 2 - Octal to Decimal conversion
// Choose an Option: 1
// Enter the decimal number: 90
// 90 in decimal = 132 in octal
//
// 1 - Decimal to Octal conversion
// 2 - Octal to Decimal conversion
// Choose an Option: 2
// Enter the octal number: 132
// 132 in octal = 90 in decimal