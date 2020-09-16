package lab.three;

import java.util.Scanner;

class SalesPerson {

    public void Sales() {
        Scanner input = new Scanner(System.in);
        double[][] sales = new double[5][4];

        for (int x = 0; x < 4; x++) {
            System.out.printf("sales person %d :\n", x + 1);
            int salesPerson = x + 1;
            System.out.print("Enter product number [1-4]: ");
            int p = input.nextInt();
            System.out.print("Enter sales amount: ");
            double amt = input.nextDouble();

            if (salesPerson >= 1 && salesPerson < 5 && p >= 1 && p < 5 && amt >= 0) {
                sales[salesPerson - 1][p - 1] += amt;
            }

            if (p > 4)
                System.out.print("Invalid input!\n");

        }

        double[] personTotal = new double[4];

        int col1;
        for (col1 = 0; col1 < 4; col1++)
            personTotal[col1] = 0;

        System.out.printf("%14s%14s%14s%14s%14s%14s\n", "Sales Person",
                "Product 1",
                "Product 2", "Product 3", "Product 4", "Total");

        int row;
        for (row = 0; row < 4; row++) {
            double productTotal = 0.0;
            System.out.printf("%14d", (row + 1));
            for (int col = 0; col < 4; col++) {
                System.out.printf("%14.2f", sales[row][col]);
                productTotal += sales[row][col];
                personTotal[col] += sales[row][col];
            }

            System.out.printf("%14.2f\n", productTotal);

        }

        System.out.printf("%14s", "Total");

        for (int col = 0; col < 4; col++)
            System.out.printf("%14.2f", personTotal[col]);

        System.out.println();

    }

}

public class TotalSales {

    public static void main(String[] args) {

        SalesPerson s = new SalesPerson();
        s.Sales();

    }

}
