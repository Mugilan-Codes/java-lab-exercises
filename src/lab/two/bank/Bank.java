package lab.two.bank;

import java.util.Scanner;

public class Bank {
    private String name;
    private double interestRate = 0.0;

    public Bank(String name) {
        this.name = name;
    }
    protected void getName() {
        System.out.println(name);
    }
    public double getCompoundInterest(double loanMoney, int year) {
        double yr = (double) year / 100;
        return loanMoney * Math.pow((1 + interestRate), yr);
    }
}

class SBI extends Bank {
    private double interestRate = 10.0;
    SBI() {
        super("State Bank of India");
    }

    @Override
    public double getCompoundInterest(double loanMoney, int year) {
        double yr = (double) year / 100;
        return loanMoney * Math.pow((1 + interestRate), yr);
    }
}

class IOB extends Bank {
    private double interestRate = 8.5;
    IOB() {
        super("Indian Overseas Bank");
    }

    @Override
    public double getCompoundInterest(double loanMoney, int year) {
        double yr = (double) year / 100;
        return loanMoney * Math.pow((1 + interestRate), yr);
    }
}

class Axis extends Bank {
    private double interestRate = 12.75;
    Axis() {
        super("Axis Bank");
    }

    @Override
    public double getCompoundInterest(double loanMoney, int year) {
        double yr = (double) year / 100;
        return loanMoney * Math.pow((1 + interestRate), yr);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Loan Money: ");
        double loanMoney = sc.nextDouble();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        Bank defaultBank = new Bank("Default Bank");
        defaultBank.getName();
        System.out.println(defaultBank.getCompoundInterest(loanMoney, year));

        SBI sbi = new SBI();
        sbi.getName();
        System.out.println(sbi.getCompoundInterest(loanMoney, year));

        IOB iob = new IOB();
        iob.getName();
        System.out.println(iob.getCompoundInterest(loanMoney, year));

        Axis axis = new Axis();
        axis.getName();
        System.out.println(axis.getCompoundInterest(loanMoney, year));
    }
}
