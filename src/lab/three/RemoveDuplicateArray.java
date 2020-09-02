package lab.three;

import java.util.Scanner;

public class RemoveDuplicateArray {

    private static boolean isPresent(int[] array, int n) {
        for (int j : array) {
            if (j == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner in = new Scanner(System.in);

        int i = 0;
        do {
            System.out.print("Enter the value for element " + (i + 1) + ": ");
            int n = in.nextInt();
            if (n < 10 || n > 100) {
                System.out.println("Number must be in the range 10 - 100");
                continue;
            }
            if (!isPresent(arr, n)) {
                arr[i] = n;
                i++;
            } else {
                System.out.println("Duplicate Value is Entered: " + n);
            }
            System.out.print("Unique Values are: ");
            for (int j : arr) {
                if (j == 0) {
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        } while (i < 5);

    }

}

//Output:
//
//Enter the value for element 1:  34
//Unique Values are: 34
//Enter the value for element 2: 23
//Unique Values are: 34 23
//Enter the value for element 3: 1
//Number must be in the range 10 - 100
//Enter the value for element 3: 101
//Number must be in the range 10 - 100
//Enter the value for element 3: 34
//Duplicate Value is Entered: 34
//Unique Values are: 34 23
//Enter the value for element 3: 45
//Unique Values are: 34 23 45
//Enter the value for element 4: 76
//Unique Values are: 34 23 45 76
//Enter the value for element 5: 98
//Unique Values are: 34 23 45 76 98