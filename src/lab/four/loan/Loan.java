package lab.four.loan;

public class Loan {

    public static void main(String[] args) {

        BankLoan[] bankLoans = new BankLoan[5];

        bankLoans[0] = new HomeLoan(55000);
        bankLoans[1] = new HomeLoan(45000);
        bankLoans[2] = new HomeLoan(65000);
        bankLoans[3] = new VehicleLoan(55000);
        bankLoans[4] = new VehicleLoan(75000);

        for (BankLoan banks: bankLoans) {
            banks.calcInterest();
            System.out.println();
        }

    }

}
