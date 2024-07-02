package exception_handling.execption_loging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.*;

class ExceptionOne extends Exception {
    private static Logger logger1 = Logger.getLogger("The Exception Logger One... 1");

    void loggerMethod() {
        StringWriter stringWriter1 = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter1));
        logger1.severe(stringWriter1.toString());

    }
}

class ExceptionTwo extends Exception {
    private static Logger logger = Logger.getLogger("The Exception Logger...!");

    public void loggerMethod() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }
}

public class Example07 {
    public static void f() throws ExceptionOne, ExceptionTwo {
        System.out.println("This the logger Exception");
        throw new ExceptionOne();
    }

    public static void g() throws ExceptionTwo {
        System.out.println("This the logger Exception");
        throw new ExceptionTwo();
    }

    public static void main(String arg[]) {
        try {
            f();
        } catch (Exception ExceptionOne) {
            // TODO: handle exception
            ExceptionOne.printStackTrace();
        }
        try {
            g();
        } catch (Exception ExceptionTwo) {
            // TODO: handle exception
            ExceptionTwo.printStackTrace();
        }
    }

}
