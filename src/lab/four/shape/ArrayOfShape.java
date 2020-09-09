package lab.four.shape;

public class ArrayOfShape {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Square(4);
        shapes[1] = new Circle(5);
        shapes[2] = new Rectangle(2,3);

        for(Shape shape: shapes) {
            shape.computeArea();
            shape.compCircumference();
            System.out.println();
        }

    }

}
