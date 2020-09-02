package lab.three;

import java.util.Scanner;

class Book {
    Scanner sc = new Scanner(System.in);

    boolean secondClass(boolean[] a) {
        for (int i = 6; i < 10; i++) {
            if (!a[i]) {
                a[i] = true;
                System.out.print("Seat no " + i + " has been booked");
                return true;
            }
        }
        return false;
    }

    boolean firstClass(boolean[] a) {
        for (int i = 1; i <= 5; i++) {
            if (!a[i]) {
                a[i] = true;
                System.out.print("seat no " + i + " has been booked");
                return true;
            }
        }
        return false;
    }

    boolean check(int n, boolean[] a) {
        if (n >= 1 && n <= 2) {
            if (n == 2) {
                boolean bookSecondClass = secondClass(a);
                if (bookSecondClass) {
                    return true;
                } else {
                    System.out.println("Your chosen class is full. Would you " +
                            "like another class for booking? Choose 1 for " +
                            "that");
                    int option = sc.nextInt();
                    if (option == 1) {
                        boolean bookFirstClass = firstClass(a);
                        if (bookFirstClass) {
                            return true;
                        } else {
                            System.out.print("Sorry all classes are filled");
                            return false;
                        }
                    } else {
                        System.out.println("Next flight arrives in 3 hours");
                    }
                }

            } else {
                boolean bookFirstClass = firstClass(a);
                if (bookFirstClass) {
                    return true;
                } else {
                    System.out.println("Your chosen class is full. Would you " +
                            "like another class for booking? Choose 2 for " +
                            "that");
                    int option = sc.nextInt();
                    if (option == 2) {
                        boolean bookSecondClass = secondClass(a);
                        if (bookSecondClass) {
                            return true;
                        } else {
                            System.out.print("Sorry all classes are filled");
                            return false;
                        }
                    } else {
                        System.out.println("Next flight arrives in 3 hours");
                        return false;
                    }
                }
            }
        }
        System.out.println("you chose wrong option");
        return false;
    }
}

public class Airlines {

    public static void main(String[] args) {

        boolean[] a = new boolean[10];
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        while (true) {
            System.out.println("\n1 - First Class\n2 - Second Class\nOther " +
                    "numbers to exit");
            System.out.print("Enter your option: ");
            int option = sc.nextInt();

            boolean verify = book.check(option, a);
            if (!verify) {
                break;
            }
        }

    }

}
