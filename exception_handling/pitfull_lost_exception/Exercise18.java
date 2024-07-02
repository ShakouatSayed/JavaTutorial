/*
 * Thinking in Java.
 * Exercise Solution 18:
 * 
 * Exercise 18: Add a second level of exception loss to LostMessage.java so
 * that the
 * HoHumException is itself replaced by a third exception.
 * 
 */

package exception_handling.pitfull_lost_exception;

class VIPExecption extends Exception {
    public String toString() {
        return "It is a Very Important Exception.";
    }
}

class HoHmException extends Exception {
    public String toString() {
        return "The Exception is a Ho Hum Exception.";
    }
}

class AnotherOneException extends Exception {
    public String toString() {
        return "This is the Another One Exception.";
    }
}

public class Exercise18 {
    public void f() throws VIPExecption {
        throw new VIPExecption();
    }

    public void dispose() throws HoHmException {
        throw new HoHmException();
    }

    public void anotherExMethod() throws AnotherOneException {
        throw new AnotherOneException();
    }

    public static void main(String args[]) {
        try {
            Exercise18 Ex = new Exercise18();
            try {
                Ex.f();
                try {
                    Ex.anotherExMethod();
                } finally {
                    Ex.dispose();
                }
            } catch (Exception e) {
                System.out.println("The second Exception block.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}