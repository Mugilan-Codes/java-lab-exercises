package lab.four.solids;

public abstract class Solid {

    double radius;

    public abstract double surfaceArea();
    public abstract double volume();
    public abstract void readRadius();

    public double baseArea(double radius) {
        return Math.PI * radius * radius;
    }

}
