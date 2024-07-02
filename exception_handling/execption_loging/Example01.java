package exception_handling.execption_loging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;

class LogException extends Exception {
    private static Logger logger = Logger.getLogger("Logging Exception....");

    public LogException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class Example01 extends LogException {
    public static void main(String args[]) {
        try {
            throw new LogException();
        } catch (LogException e) {
            System.err.println("Caught: " + e);
            e.printStackTrace();
        }
        try {
            throw new LogException();
        } catch (LogException e) {
            System.err.println("Caught: " + e);
            e.printStackTrace();
        }
    }
}
