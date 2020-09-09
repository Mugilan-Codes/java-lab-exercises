package lab.four.solids;

import java.util.Scanner;

public class Sphere extends Solid {
    @Override
    public double surfaceArea() {
        return 4 * baseArea(radius);
    }

    @Override
    public double volume() {
        return (4 * baseArea(radius) * radius) / 3;
    }

    @Override
    public void readRadius() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of the Sphere: ");
        radius = input.nextDouble();
        input.close();
    }
}
