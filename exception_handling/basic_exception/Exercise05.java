
/*
 * Thinking in Java.
 * Exercise Solution 5:
 * 
 * Exercise 5: Create your own resumption-like behavior using a while loop that
 * repeats until an exception is no longer thrown.
 */

package exception_handling.basic_exception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("Logging Exception....");

    public LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    };
}

public class Exercise05 {
    private static String arl[] = new String[5];
    static int x = 0;
    static String s1 = "Sayed Hossen";

    public static void main(String args[]) {
        do {
            try {
                for (int i = arl.length; i >= 0; i--)
                    System.out.println(s1 + " " + i);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caough ArrayIndexOutOfBoundsException");
                e.printStackTrace();
                // x--;
                System.err.println(e);

            } finally {
                System.out.println("this code also run....!");
            }
        } while (x-- > 1);
        System.out.println("this statement is test perpous..");
        ///
    }

}
