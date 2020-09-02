package lab.two.Matrices;

import java.util.Scanner;

public class AddMatrix {

    private int rows, columns;
    private int[][] a, b, sum;

    AddMatrix() {
        this.rows = 2;
        this.columns = 2;
        setMatrices();
    }

    AddMatrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        setMatrices();
    }

    private void setMatrices() {
        this.a = new int[rows][columns];
        this.b = new int[rows][columns];
        this.sum = new int[rows][columns];
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

    public void displayMatrices() {
        System.out.println("Getting inputs...");
        getInputs();
        addMatrices();

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

        System.out.println("The Sum Matrix:");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private void addMatrices() {
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
    }

}
