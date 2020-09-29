package lab.six;

import java.util.Scanner;

public class SearchCount {

    private static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    private static int countOccurrences(String search, String str) {
        if (isEmpty(search) || isEmpty(str)) {
            return 0;
        }

        int index = 0, count = 0;
        while (true) {
            index = str.indexOf(search, index);
            if (index == -1) {
                break;
            }
            count++;
            index += search.length();
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Searching and Counting Occurrences");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String bigString = in.nextLine();

        System.out.print("Enter the Search Character: ");
        String searchString = in.nextLine();

        int count = countOccurrences(searchString, bigString);
        System.out.println("Number of Occurrences = " + count);

    }

}
