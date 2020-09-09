package lab.four.solids;

import java.util.Scanner;

public class Cylinder extends Solid {

    double height;

    @Override
    public double surfaceArea() {
        return (2 * baseArea(radius)) + (2 * (baseArea(radius) / radius) * height);
    }

    @Override
    public double volume() {
        return baseArea(radius) * height;
    }

    @Override
    public void readRadius() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of the Cylinder: ");
        radius = input.nextDouble();
        input.close();
    }
}
