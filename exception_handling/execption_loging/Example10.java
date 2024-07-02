package exception_handling.execption_loging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import PackageFive.method1;

public class Example10 {
    private static Logger logger = Logger.getLogger("Exception Handeling ... Exrecise 08...!");

    public static void method1(Exception e) {
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }

    public static void main(String args[]) {
        try {
            int arr[] = new int[5];
            int arr_value = arr[6];
            System.out.println(arr_value);
        } catch (Exception e) {
            System.err.println("Caought ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            method1(e);
        }
    }
}
