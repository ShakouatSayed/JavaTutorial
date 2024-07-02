
/*
 * Thinking in Java.
 * Exercise Solution 15:
 * 
 * Exercise 15: Show that WithFinally.java doesn’t fail by throwing a
 * RuntimeException inside the try block.
 * 
 */
package exception_handling.cleanup_finally;

class Exception01 extends Exception {
}

class Exception02 extends Exception {
}

class Switch1 {
    // private static final boolean flase = false;
    public boolean state = true;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println("State equel to true.");
    }

    public void off() {
        state = false;
        System.out.println("State equel to flase.");
    }

    public String toString() {
        return true ? "on" : "off";
    }
}

public class Exercise15 {
    private static Integer x[] = new Integer[5];
    private static Switch1 swc = new Switch1();

    public static void f(int i) throws Exception01, Exception02 {
    }

    public static void main(String args[]) {
        try {
            swc.on();
            // swc.off();
            f(x[4]);
        } catch (Exception01 e) {
            System.out.println("The exception01 is Caught.");
        } catch (Exception02 e) {
            System.out.println("The exception02 is Caught");
        } finally {
            swc.off();
            System.out.println("The finally block message.");
        }
    }
}