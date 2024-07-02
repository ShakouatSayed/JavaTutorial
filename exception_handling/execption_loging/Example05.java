package exception_handling.execption_loging;

class MyException extends Exception {
    private int x;

    public MyException() {
    };

    public MyException(String msg) {
        super(msg);
    }

    public MyException(String message, int x) {
        super(message);
        this.x = x;
    }

    public int val() {
        return x;
    }

    public String getMessage() {
        return "Driceat Message: " + x + super.getMessage();
    }
}

public class Example05 extends MyException {
    public static void f() throws MyException {
        System.out.println("The function is f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("The function is g()");
        throw new MyException("Origined of g(): ");
    }

    public static void h() throws MyException {
        System.out.println("The function is h()");
        throw new MyException(" Origined of h() ", 47);
    }

    public static void main(String args[]) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException e) {
            // TODO: handle exception
            e.printStackTrace(System.out);

        }
        try {
            h();
        } catch (MyException e) {
            e.printStackTrace(System.out);
            System.out.println("e.val() = " + e.val());
        }
    }
}
