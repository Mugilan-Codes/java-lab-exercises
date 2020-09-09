package lab.four.loan;

public class VehicleLoan extends BankLoan {

    double salary;
    VehicleLoan(double income) {
        this.salary = income;
    }

    @Override
    void calcInterest() {
        System.out.println("Salary of Rs." + salary);
        if(salary > 60000) {
            vehicleLoan();
            homeLoan();
        } else {
            System.out.println("Not Eligible for Vehicle Loan");
            if(salary > 50000) {
                homeLoan();
            }
        }
    }

    @Override
    public void homeLoan() {
        System.out.println("Eligible for Home Loan of Rs. 20,00,000 with an interest rate of 9.5%");
    }

    @Override
    public void vehicleLoan() {
        System.out.println("Eligible for Vehicle Loan of Rs.12,00,000 with an interest rate of 10.5%");
    }
}
