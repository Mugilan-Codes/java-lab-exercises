package lab.four.shape;

public class Square extends Shape{

    double side;
    Square(double side) {
        this.side = side;
    }

    @Override
    void compCircumference() {
        double circumference = 4 * side;
        System.out.println("Circumference of Square of side " + side + " cm = " + circumference);
    }

    @Override
    public void computeArea() {
        double area = side * side;
        System.out.println("Area of square of side " + side + " cm = " + area);
    }
}
