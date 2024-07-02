
/*
 * Thinking in Java.
 * Exercise Solution 8:
 * 
 * Exercise 8: Write a class with a method that throws an exception of the type
 * created
 * in Exercise 4. Try compiling it without an exception specification to see
 * what the compiler
 * says. Add the appropriate exception specification. Try out your class and its
 * exception inside a try-catch clause.
 * 
 * Exercise 4: Create your own exception class using the extends keyword. Write
 * a
 * constructor for this class that takes a String argument and stores it inside
 * the object with a
 * String reference. Write a method that displays the stored String. Create a
 * try-catch clause
 * to exercise your new exception.
 * 
 */

package exception_handling.exception_specification;

class Exception08 extends Exception {
    private String msg;

    Exception08(String msg) {

        super(msg);
        System.out.println("This is message..." + msg);
        this.msg = msg;
    };

    // protected void show() {
    // System.out.println("This is method of the Exceptions01........!");
    // }

}

class Test01 {
    public static void method1() throws Exception08 {
        System.out.println("this method is Execise01.....!");
        throw new Exception08("Exception message...!");
    }
}

public class Exercise08 {
    public static void main(String args[]) {
        try {
            Test01 OB1 = new Test01();
            OB1.method1();
        } catch (Exception08 e) {
            e.printStackTrace(System.out);
            // e.show();
        }
    }
}
