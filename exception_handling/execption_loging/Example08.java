package exception_handling.execption_loging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class Exception01 extends Exception {
    private Logger logger = Logger.getLogger("Logging Exception....");

    protected void loggerMethod() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }
}

class Exception02 extends Exception {
    private Logger logger = Logger.getLogger("Logging Exception....");

    protected void loggerMethod() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }
}

class Exception03 extends Exception {
    private Logger logger = Logger.getLogger("Logging Exception....");

    protected void loggerMethod() {
        StringWriter stringWriter = new StringWriter();
        printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }
}

public class Example08 {
    public static void f() throws Exception01, Exception02, Exception03 {
        System.out.println("This is the Exception01 class method of f()....!");
        throw new Exception01();
    }

    public static void g() throws Exception02 {
        System.out.println("This is the Exception01 class method of f()....!");
        throw new Exception02();
    }

    public static void h() throws Exception03 {
        System.out.println("This is the Exception01 class method of f()....!");
        throw new Exception03();
    }

    public static void main(String args[]) {
        try {
            f();
        } catch (Exception Exception01) {
            Exception01.printStackTrace();
        }
        try {
            g();
        } catch (Exception Exception02) {
            Exception02.printStackTrace();
        }
        try {
            h();
        } catch (Exception Exception03) {
            Exception03.printStackTrace();
        }
    }

}
