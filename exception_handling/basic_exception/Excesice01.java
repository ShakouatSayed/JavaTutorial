/*
 * Thinking in Java.
 * Exercise Solution 1:
 * 
 * Exercise 1: Create a class with a main( ) that throws an object of class
 * Exception
 * inside a try block. Give the constructor for Exception a String argument.
 * Catch the
 * exception inside a catch clause and print the String argument. Add a finally
 * clause and
 * print a message to prove you were there.
 */

package exception_handling.basic_exception;

class TestException extends Exception {
    TestException() {
    };

    public TestException(String msg) {
        super(msg);
    };

}

public class Excesice01 extends TestException {
    public void method1() throws TestException {
        System.out.println("This is the exception of method1()");
        throw new TestException("Exception is haldale is class of Excesice01..!");
    }

    public static void main(String args[]) {
        Excesice01 OB1 = new Excesice01();
        try {
            OB1.method1();
        } catch (TestException e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("This clouse will be any executed by always....!");
        }
    }
}
