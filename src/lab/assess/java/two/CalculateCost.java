package lab.assess.java.two;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CalculateCost {

    private double totalKmPerDay, costPerLitre, mileage, parkingChargePerDay, tollChargePerDay, dailyDrivingCost;

    CalculateCost(double totalKmPerDay, double costPerLitre, double mileage, double parkingChargePerDay, double tollChargePerDay) {
        this.totalKmPerDay = totalKmPerDay;
        this.costPerLitre = costPerLitre;
        this.mileage = mileage;
        this.parkingChargePerDay = parkingChargePerDay;
        this.tollChargePerDay = tollChargePerDay;
    }

    private void storeInDatabase() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java_lab_swing", "mugil", "");

        String sql = "INSERT INTO drive_cost(totalKm, gasolineCost, mileage, parkingCharge, tollCharge, totalCost) VALUES(?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setDouble(1, totalKmPerDay);
            preparedStatement.setDouble(2, costPerLitre);
            preparedStatement.setDouble(3, mileage);
            preparedStatement.setDouble(4, parkingChargePerDay);
            preparedStatement.setDouble(5, tollChargePerDay);
            preparedStatement.setDouble(6, dailyDrivingCost);

            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void getDailyCostOfDriving() throws SQLException {
        double gasolineRequired = totalKmPerDay / mileage;
        System.out.printf("\nGasoline Required Per Day: %.2f Litres", gasolineRequired);
        double gasolinePrice = costPerLitre * gasolineRequired;
        System.out.printf("\nPrice of Gasoline Per Day: Rs.%.2f", gasolinePrice);
        double totalCost = gasolinePrice + parkingChargePerDay + tollChargePerDay;
        System.out.print("\nDaily Driving cost: Rs." + totalCost);

        BigDecimal bd = new BigDecimal(totalCost).setScale(2, BigDecimal.ROUND_HALF_UP);
        dailyDrivingCost = bd.doubleValue();
        System.out.println(" ~ Rs." + dailyDrivingCost);

        storeInDatabase();

        System.out.println("Choose Car-Pooling and Save Money with the added benefit of saving the Environment");
    }

}
