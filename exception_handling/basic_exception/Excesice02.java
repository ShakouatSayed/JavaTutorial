/*
 * Thinking in Java.
 * Exercise Solution 1:
 * 
 * Exercise 2:  Define an object reference and initialize it to null. Try to
 * call a method
 * through this reference. Now wrap the code in a try-catch clause to catch the
 * exception.
 * 
 */

package exception_handling.basic_exception;

public class Excesice02 {
    public static void main(String args[]) {
        Object OB1 = null;
        try {
            OB1.getClass();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
