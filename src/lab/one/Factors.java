package lab.one;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("The Factors of " + num + " = ");
        for(int i = 1; i <= num; ++i) {
            if(num % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}

// Output:
//
// Enter a number: 56
// The Factors of 56 = 1 2 4 7 8 14 28 56 