package lab.two.employee;

class Employee {
    private String name;
    Employee(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}

class SalaryEmployee extends Employee{
    private int salary;
    SalaryEmployee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    protected int getSalary() {
        return salary;
    }

    public void getDetails() {
        System.out.println("The Name of the Salaried Employee: " + getName());
        System.out.println("The Salary Amount                : " + getSalary());
    }
}

class Programmer extends SalaryEmployee {
    private int age;
    Programmer(String name, int salary, int age) {
        super(name, salary);
        this.age = age;
    }

    protected int getAge() {
        return age;
    }

    public void getDetails() {
        System.out.println("The Name of the Salaried Employee: " + getName());
        System.out.println("The Salary Amount                : " + getSalary());
        System.out.println("The Age of the Employee          : " + getAge());
    }
}