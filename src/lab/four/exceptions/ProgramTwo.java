package lab.four.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramTwo {

    public static void main(String[] args) {

        int[] arr = new int[10];

        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Sorting in Descending Order...");
        for(int i=0;i< arr.length;i++) {
            for(int j=i+1; j< arr.length;j++) {
                int temp =0;
                if(arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        try {
            for (int j : arr) {
                System.out.println(j);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
