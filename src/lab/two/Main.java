package lab.two;

public class Main {

    public static void main(String[] args) {

        Student stud1 = new Student();
        Student stud2 = new Student("Samantha", 30);

        stud1.getDetails();
        stud2.getDetails();
        stud1 = null; // Needed for Destructor to be called
        stud2 = null;
        System.gc();

    }

}
