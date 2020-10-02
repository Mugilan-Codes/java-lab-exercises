package lab.six;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {

    public static void main(String[] args) throws ParseException {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Date (MM/DD/YYYY): ");
        String dateString = in.nextLine();

        Date dateFormat = new SimpleDateFormat("MM/dd/yyyy").parse(dateString);

        String printString = new SimpleDateFormat("MMMM dd, yyyy").format(dateFormat);
        System.out.println(printString);

    }

}
