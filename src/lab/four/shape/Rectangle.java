package lab.four.shape;

public class Rectangle extends Shape {

    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void compCircumference() {
        double circumference = 2 * (length + width);
        System.out.println("Circumference of Rectangle of length " + length + " cm and width " + width + " = " + circumference);
    }

    @Override
    public void computeArea() {
        double area = length * width;
        System.out.println("Area of Rectangle of length " + length + " cm and width " + width + " = " + area);
    }
}
