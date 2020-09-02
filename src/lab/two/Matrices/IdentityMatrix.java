package lab.two.Matrices;

import java.util.Scanner;

public class IdentityMatrix {

    private int rows, columns;
    private boolean isIdentity = true;
    private int[][] matrix;

    IdentityMatrix() {
        this(3);
    }

    IdentityMatrix(int side) {
        this.rows = side;
        this.columns = side;
        setMatrix();
    }

    private void setMatrix() {
        this.matrix = new int[rows][columns];
    }

    private void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the " + rows + "x" + columns + " matrix:");
        for (int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print("Element " + i + "x" + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    private void displayMatrix() {
        System.out.println("The Matrix: ");
        for (int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void checkIdentity() {
        getInput();
        displayMatrix();

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++) {
                if (i == j && matrix[i][j] != 1) {
                    isIdentity = false;
                    break;
                }
                if(i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
        }

        if (isIdentity) {
            System.out.println("Given matrix is a identity matrix");
        } else {
            System.out.println("Given matrix is not a identity matrix");
        }
    }

}
