package lab.four.loan;

public class HomeLoan extends BankLoan {

    double salary;
    HomeLoan(double income) {
        this.salary = income;
    }

    @Override
    void calcInterest() {
        System.out.println("Salary of Rs." + salary);
        if(salary > 50000) {
            homeLoan();
            if (salary > 60000) {
                System.out.print("Also ");
                vehicleLoan();
                System.out.println();
            }
        } else {
            System.out.println("Not Eligible for Home Loan");
        }
    }

    @Override
    public void homeLoan() {
        System.out.println("Eligible for Home Loan of Rs. 20,00,000 with an interest rate of 9.5%");
    }

    @Override
    public void vehicleLoan() {
        System.out.print("Eligible for Vehicle Loan of Rs.12,00,000 with an interest rate of 10.5%");
    }
}
