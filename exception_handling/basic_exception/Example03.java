package exception_handling.basic_exception;

class MyException extends Exception {

    public MyException() {
    };

    public MyException(String msg1) {
        super(msg1);
    }
}

public class Example03 extends MyException {
    public void f() throws MyException {
        System.out.println("Throw the exceptions f()");
        throw new MyException();
    }

    public void g() throws MyException {
        System.out.println("Throw the exceptions g()");
        throw new MyException("Originited of g()");
    }

    public static void main(String args[]) {
        Example03 OB1 = new Example03();
        try {
            OB1.f();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
        try {
            OB1.g();
        } catch (MyException e) {
            e.printStackTrace(System.out);
        }
    }
}
