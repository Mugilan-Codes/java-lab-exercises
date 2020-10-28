package lab.assess.java.two;

import java.sql.SQLException;
import java.util.Scanner;

public class TotalCost {

    public static void main(String[] args) throws SQLException {
        System.out.println("Calculate Daily Driving Cost");

//        CalculateCost calculateCost = new CalculateCost(45, 75, 10, 35, 50);

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Kilometers travelled in a Day (Km): ");
        double kmTravelledPerDay = in.nextDouble();

        System.out.print("Enter the Cost Per Litre of Gasoline (Rs.): ");
        double costPerLitre = in.nextDouble();

        System.out.print("Enter the Mileage of your vehicle (Km): ");
        double mileage = in.nextDouble();

        System.out.print("Enter the Parking Fees per Day (Rs.): ");
        double parkingCharge = in.nextDouble();

        System.out.print("Enter the Total Toll Charge per Day (Rs.): ");
        double tollCharge = in.nextDouble();

        CalculateCost calculateCost = new CalculateCost(kmTravelledPerDay, costPerLitre, mileage, parkingCharge, tollCharge);

        calculateCost.getDailyCostOfDriving();
    }

}
