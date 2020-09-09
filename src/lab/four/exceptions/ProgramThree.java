package lab.four.exceptions;

public class ProgramThree {

    public static void someMethod() throws Throwable {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("someMethod()");
            throw e;
        }
    }

    public static void someMethod2() throws Exception {
        System.out.println("someMethod2()");
        throw new Exception("Thrown from someMethod2()");
    }

    public static void main(String[] args) throws Throwable {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println("main()");
            e.printStackTrace();
        }
    }

}
