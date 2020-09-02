package lab.three;

public class VariableLength {

    private static void product(int... args) {
        int prod = 1;
        System.out.print("Product of ");
        for (int i : args) {
            System.out.print(i + ", ");
            prod *= i;
        }

        System.out.println("Answer = " + prod);
    }

    public static void main(String[] args) {

        product(1);
        product(1, 2);
        product(1, 2, 3);
        product(1, 2, 3, 4);
        product(1, 2, 3, 4, 5);

    }

}

//Output:
//
//Product of 1, Answer = 1
//Product of 1, 2, Answer = 2
//Product of 1, 2, 3, Answer = 6
//Product of 1, 2, 3, 4, Answer = 24
//Product of 1, 2, 3, 4, 5, Answer = 120