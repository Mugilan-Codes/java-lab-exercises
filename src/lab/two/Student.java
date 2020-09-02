package lab.two;

public class Student {

    private String name;
    private int age;

    public Student() {
        this.name = "Mugilan";
        this.age = 21;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void getDetails() {
        System.out.println("Name of the java.lab.one.Student: " + name);
        System.out.println("Age of the java.lab.one.Student : " + age);
    }

    @Override
    protected void finalize() {
        System.out.println("Destructor Called...");
    }
}