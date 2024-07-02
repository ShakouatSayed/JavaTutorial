package exception_handling.rethrowing_exception;

class ExceptionOne extends Exception {
    public ExceptionOne(String s) {
        super(s);
    }
}

class ExceptionTwo extends Exception {
    public ExceptionTwo(String s) {
        super(s);
    }
}

public class Example02 {
    public static void f() throws ExceptionOne {
        System.out.println("This is Exception One..");
        throw new ExceptionOne("Throw the Exception one message...!");
    }

    public static void main(String args[]) {
        try {
            try {
                f();
            } catch (ExceptionOne e) {
                System.out.println("Cautght Excetion..!");
                e.printStackTrace();
                throw new ExceptionTwo("this is throw a message of Exceptiontwo ");
            }
        } catch (ExceptionTwo e) {
            System.out.println("Caught Exception...!");
            e.printStackTrace();
        }
    }
}
