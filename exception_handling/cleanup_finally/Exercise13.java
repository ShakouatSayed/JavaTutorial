
/*
 * Thinking in Java.
 * Exercise Solution 13:
 * 
 * Exercise 13: Modify Exercise 9 by adding a finally clause. Verify that your
 * finally
 * clause is executed, even if a NullPointerException is thrown.
 * 
 * Exercise 9: Create three new types of exceptions. Write a class with a method
 * that
 * throws all three. In main( ), call the method but only use a single catch
 * clause that will
 * catch all three types of exceptions.
 * 
 */

package exception_handling.cleanup_finally;

class Type1 extends Exception {
    Type1(String s) {
        super(s);
    }
}

class Type2 extends Exception {
    Type2(String s) {
        super(s);
    }
}

class Type3 extends Exception {
    Type3(String s) {
        super(s);
    }
}

public class Exercise13 {
    private static Integer x[] = new Integer[1];

    public static void f(int x) throws Type1, Type2, Type3 {
        if (x == 0)
            throw new Type1("x==0");
        if (x <= 0)
            throw new Type2("x<=0");
        if (x >= 0)
            throw new Type3("x>=0");

    }

    public static void main(String args[]) {
        try {
            f(x[0]);
            f(0);
            f(-1);
            f(1);

        } catch (Exception e) {
            System.out.println("Caught exception.");
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Without the catch block.");

        }
    }

}
