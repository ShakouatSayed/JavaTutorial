/*
 * Thinking in Java.
 * Exercise solution 10:
 * 
 * Exercise 10: Create a class with two methods, f( ) and g( ). In g( ), throw
 * an
 * exception of a new type that you define. In f( ), call g( ), catch its
 * exception and, in the catch
 * clause, throw a different exception (of a second type that you define). Test
 * your code in
 * main( ).
 * 
 */

package exception_handling.exception_chaining;

class ExceptionOne extends Exception {
    public ExceptionOne(String s) {
        super(s);
    }
}

class ExceptionThree extends Exception {
    public ExceptionThree(String s) {
        super(s);
    }
}

public class Exercise10 {
    public static void g() throws ExceptionOne {
        // throw new ExceptionOne("null");
        throw new ExceptionOne("null");
    }

    public static void f() {
        try {
            try {
                g();
                int a = 20, b = 30;
                System.out.println(a >= b || a != b);
            } catch (ExceptionOne e) {
                System.err.println("Caught Exception...!");
                e.printStackTrace(System.out);
                throw new ExceptionThree("Exception massage..!");
            }
        } catch (ExceptionThree ex) {
            System.out.println("Caught Exception..!");
            ex.printStackTrace(System.out);
        }
    }

    public static void main(String args[]) {
        f();
    }
}
