/*
 * Thinking In Java
 * Exercise Solution:
 * 
 * Exercise 11: Repeat the previous exercise, but inside the catch clause, wrap
 * g( )’s
 * exception in a RuntimeException.
 */

package exception_handling.exception_chaining;

class ExceptionOne1 extends Exception {
    public ExceptionOne1(String s) {
        super(s);
    }
}

public class Exercise11 {
    public static void g() throws ExceptionOne1 {
        throw new ExceptionOne1("Many Other Exception.");
    }

    static void f() {
        try {
            g();
            throw new ExceptionOne1("Message of Exception Throwing...");
        } catch (ExceptionOne1 ex) {
            System.err.println("Caught Exception...!");
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    public static void main(String args[]) {
        f();
    }
}
