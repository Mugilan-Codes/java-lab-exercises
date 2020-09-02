package lab.two.employee;

public class Main {

    public static void main(String[] args) {

        SalaryEmployee salaryEmployee = new SalaryEmployee("Aravind", 45000);
        salaryEmployee.getDetails();

        Programmer programmer = new Programmer("Mugilan", 90000, 21);
        programmer.getDetails();

    }

}
