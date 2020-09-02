package lab.two.Matrices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("1 - Addition\n2 - Subtraction\n3 - Check Identity");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Matrix Addition");
                AddMatrix addMatrix = new AddMatrix(1, 2);
                addMatrix.displayMatrices();
                break;
            case 2:
                System.out.println("Matrix Subtraction");
                SubMatrix subMatrix = new SubMatrix();
                subMatrix.displayMatrices();
                break;
            case 3:
                System.out.println("Check for Identity Matrix");
                IdentityMatrix identityMatrix = new IdentityMatrix();
                identityMatrix.checkIdentity();
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }

}
