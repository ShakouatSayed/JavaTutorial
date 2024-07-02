/*
 * Thinking in Java.
 * Exercise Solution 28:
 * 
 * Exercise 28: Modify Exercise 4 so that the custom exception class
 * inherits from
 * RuntimeException, and show that the compiler allows you to leave out the try
 * block.
 */

package exception_handling.ConChe_uncExc;

class CustomException extends RuntimeException {
    private String msg;

    public CustomException(String msg) {
        // super(msg);
        System.out.println("Custom Exception...!");
        this.msg = msg;
    }

    protected void show() {
        System.out.println("This method also show message is: " + msg);
    }

}

public class Exercise28 {
    public static void f() throws CustomException {
        System.out.println("This is the show is Custom Exception message.");
        throw new CustomException("This message is show in the show method..");
    }

    public static void main(String args[]) {
        // try {
        // f();
        // } catch (CustomException e) {
        // System.out.println("Caught Exception is: ");
        // e.printStackTrace(System.out);
        // e.show();

        // }
        f();
    }
}