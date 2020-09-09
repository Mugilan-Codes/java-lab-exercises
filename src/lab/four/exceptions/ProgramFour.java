package lab.four.exceptions;

class ExceptionA extends Exception {
    ExceptionA(String s) {
        super(s);
    }
}

class ExceptionB extends ExceptionA {
    ExceptionB(String s) {
        super(s);
    }
}

class ExceptionC extends ExceptionB {
    ExceptionC(String s) {
        super(s);
    }
}

public class ProgramFour {
    public static void main(String[] args) {
        try{
            getExceptionB();
        } catch (ExceptionA e) {
            e.printStackTrace();
        }

        try {
            getExceptionC();
        } catch (ExceptionA e) {
            e.printStackTrace();
        }
    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB("This is Exception B");
    }

    public static void getExceptionC() throws ExceptionC {
        throw new ExceptionC("This is Exception C");
    }
}
