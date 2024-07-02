package exception_handling.execption_loging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

// class MyException extends Exception {
//     public static Logger logger = Logger.getLogger("Logging Exception .... is working..");

//     public void ExceptionMethod() {
//         StringWriter stringWriter = new StringWriter();

//     }
// }

public class Example03 extends Exception {
    public static Logger logger = Logger.getLogger("Logging Exception .... is working..");

    private void ExceptionMethod() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }

    public static void main(String args[]) {
        try {
            throw new Example03();
        } catch (Example03 e) {
            System.out.println("Caught: " + e);
            e.printStackTrace();
        }
    }
}
