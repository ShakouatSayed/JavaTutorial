/*
 * Thinking in Java.
 * Exercise Solution 14:
 * 
 * Exercise 14: Show that OnOffSwitch.java can fail by throwing a
 * RuntimeException inside the try block.
 * 
 */
package exception_handling.cleanup_finally;

class OonException extends Exception {
};

class OoffException extends Exception {
};

class Switch01 {
    boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println("True");
    }

    public void off() {
        state = false;
        System.out.println("False");
    }

    public String toString() {
        return state == true ? "On" : "Off";
    }
}

public class Exercise14 {

    private static Integer x[] = new Integer[1];
    private static Switch01 swc = new Switch01();

    public static void f(int x) throws OonException, OoffException {
    };

    public static void main(String args[]) {
        try {
            swc.on();
            // fail by throwing a RuntimeException inside the try block.
            f(x[0]);
            Exercise14.f(1);
        } catch (OonException e) {
            System.out.println("Caught Execption.");
        } catch (OoffException e) {
            System.out.println("Caught Execption.");
        } finally {
            swc.off();
        }
    }
}
