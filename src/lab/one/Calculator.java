package lab.one;

import java.util.Scanner;

public class Calculator {
    static double add(double a, double b) {
        return a + b;
    }
    static double sub(double a, double b) {
        return a - b;
    }
    static double mul(double a, double b) {
        return a * b;
    }
    static double div(double a, double b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose a operation to perform");
        System.out.println("1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division");
        System.out.print("Your choice: ");
        int choice = input.nextInt();

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        String result = "";

        switch (choice) {
            case 1: result = num1 + " + " + num2 + " = " + add(num1, num2); break;
            case 2: result = num1 + " - " + num2 + " = " + sub(num1, num2); break;
            case 3: result = num1 + " * " + num2 + " = " + mul(num1, num2); break;
            case 4: result = num1 + " / " + num2 + " = " + div(num1, num2); break;
            default:
                System.out.println("Wrong Choice");
        }

        System.out.println(result);

    }
}

// Output:
//
// Choose a operation to perform
// 1 - Addition
// 2 - Subtraction
// 3 - Multiplication
// 4 - Division
// Your choice: 3
// Enter first number: 2
// Enter second number: 3
// 2.0 * 3.0 = 6.0