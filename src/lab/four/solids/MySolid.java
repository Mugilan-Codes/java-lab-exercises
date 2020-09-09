package lab.four.solids;

import java.util.Scanner;

public class MySolid {

    public static void main(String[] args) {

        System.out.println("Calculate Volume and Surface Area");
        System.out.println("\n1 - Cylinder\n2 - Sphere\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("Cylinder");
                Cylinder cylinder = new Cylinder();
                System.out.print("Set the Height of the Cylinder: ");
                cylinder.height = input.nextDouble();
                cylinder.readRadius();
                System.out.println("Surface Area = " + cylinder.surfaceArea());
                System.out.println("Volume = " + cylinder.volume());
            }
            case 2 -> {
                System.out.println("Sphere");
                Sphere sphere = new Sphere();
                sphere.readRadius();
                System.out.println("Surface Area = " + sphere.surfaceArea());
                System.out.println("Volume = " + sphere.volume());
            }
            default -> System.out.println("Invalid Choice");
        }

    }

}
