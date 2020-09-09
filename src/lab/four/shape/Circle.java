package lab.four.shape;

public class Circle extends Shape {

    double radius;
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void compCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of circle of radius " + radius + " cm = " + circumference);
    }

    @Override
    public void computeArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle of radius " + radius + " cm = " + area);
    }
}
