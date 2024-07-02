package exception_handling.execption_loging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

// class LoggingException01 extends Exception {

// }

public class Example02 extends Exception {
    private static Logger logger = Logger.getLogger("Logging Exception...!");

    static void loggerExceptionMethod(Exception e) {
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }

    public static void main(String args[]) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }
}
