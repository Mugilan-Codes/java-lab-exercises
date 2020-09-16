package lab.two.Matrices;

import java.util.Scanner;

public class SubMatrix {

    private int rows, columns;
    private int[][] a, b, diff;

    SubMatrix() {
        this(2,  2);
    }

    SubMatrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        setMatrices();
    }

    private void setMatrices() {
        this.a = new int[rows][columns];
        this.b = new int[rows][columns];
        this.diff = new int[rows][columns];
    }

    private void getInputs() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the first " + rows + " x " + columns + " matrix:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(i + " x " + j + " element = ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second " + rows + " x " + columns + " matrix:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(i + " x " + j + " element = ");
                b[i][j] = sc.nextInt();
            }
        }
    }

    private void subMatrices() {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                diff[i][j] = a[i][j] - b[i][j];
            }
        }
    }

    public void displayMatrices() {
        System.out.println("Getting inputs...");
        getInputs();
        subMatrices();

        System.out.println("The First Matrix:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("The Second Matrix:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("The Difference Matrix:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(diff[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
