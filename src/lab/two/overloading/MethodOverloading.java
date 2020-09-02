package lab.two.overloading;

public class MethodOverloading {

    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double sub(double a, double b) {
        return a - b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public double sub(double a, double b, double c) {
        return a - b - c;
    }
    public int sub(int a, int b, int c) {
        return a - b - c;
    }

}

class Overload {

    public static void main(String[] args) {

        MethodOverloading overload = new MethodOverloading();

        System.out.println(overload.add(2, 3));
        System.out.println(overload.add(2, 3, 4));
        System.out.println(overload.add(2.4, 3.2));
        System.out.println(overload.add(2.4, 3.2, 4.6));

        System.out.println(overload.sub(5, 3));
        System.out.println(overload.sub(5, 4, 3));
        System.out.println(overload.sub(4.2, 3.2));
        System.out.println(overload.sub(5.2, 4.6, 2.6));
    }

}
