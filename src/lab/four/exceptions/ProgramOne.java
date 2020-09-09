package lab.four.exceptions;

public class ProgramOne {

    public static void main(String[] args) {

        int[] arr = new int[5];

        try {
            arr[0] = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            arr[6] = 60;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

}
