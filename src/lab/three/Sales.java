package lab.three;

import java.util.Arrays;
import java.util.Scanner;

public class Sales {

    private static int getCommission(double sales) {
        return (int) (200 + (0.09 * sales));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter No. of Employees: ");
        int noOfEmployees = in.nextInt();

        double[] sales = new double[noOfEmployees];
        double[] salary = new double[noOfEmployees];
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter the Gross Sales of the Employee " + (i + 1) + ": ");
            sales[i] = in.nextDouble();
            salary[i] = getCommission(sales[i]);
        }

        int[] salaryRangeCount = new int[9];

        String[] ranges = {
                "$200-$299",
                "$300-$399",
                "$400-$499",
                "$500-$599",
                "$600-$699",
                "$700-$799",
                "$800-$899",
                "$900-$999",
                "$1000 and over"
        };

        for (int i = 0; i < salary.length; i++) {
            System.out.println("Salary of Employee " + (i + 1) + " = " + salary[i]);
            if (salary[i] < 300) {
                salaryRangeCount[0]++;
            } else if (salary[i] > 300 && salary[i] < 400) {
                salaryRangeCount[1]++;
            } else if (salary[i] > 400 && salary[i] < 500) {
                salaryRangeCount[2]++;
            } else if (salary[i] > 500 && salary[i] < 600) {
                salaryRangeCount[3]++;
            } else if (salary[i] > 600 && salary[i] < 700) {
                salaryRangeCount[4]++;
            } else if (salary[i] > 700 && salary[i] < 800) {
                salaryRangeCount[5]++;
            } else if (salary[i] > 800 && salary[i] < 900) {
                salaryRangeCount[6]++;
            } else if (salary[i] > 900 && salary[i] < 1000) {
                salaryRangeCount[7]++;
            } else {
                salaryRangeCount[8]++;
            }
        }

        System.out.printf("%-15s %-5s %n", "Salary Range", "Count");
        for (int i = 0; i < ranges.length; i++) {
            System.out.printf("%-15s %-5d %n", ranges[i], salaryRangeCount[i]);
        }
    }
}

//Output:
//
//Enter No. of Employees: 5
//Enter the Gross Sales of the Employee 1: 5000
//Enter the Gross Sales of the Employee 2: 4000
//Enter the Gross Sales of the Employee 3: 2569.45
//Enter the Gross Sales of the Employee 4: 12345
//Enter the Gross Sales of the Employee 5: 7604.32
//Salary of Employee 1 = 650.0
//Salary of Employee 2 = 560.0
//Salary of Employee 3 = 431.0
//Salary of Employee 4 = 1311.0
//Salary of Employee 5 = 884.0
//Salary Range	Count
//$200-$299      	0
//$300-$399      	0
//$400-$499      	1
//$500-$599      	1
//$600-$699      	1
//$700-$799      	0
//$800-$899      	1
//$900-$999      	0
//$1000 and over 	1