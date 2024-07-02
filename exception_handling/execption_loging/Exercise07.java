
/*
 * Thinking in Java.
 * Exercise Solution 7:
 * 
 * Exercise 7: Modify Exercise 3 so that the catch clause logs the results.
 * 
 * Exercise 3: Write code to generate and catch an
 * ArraylndexOutOfBoundsException.
 */

package exception_handling.execption_loging;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

// class ExceptionExercise extends Exception {

// public ExceptionExercise(String msg) {
// super(msg);
// };
// }

// public class Exercise07 {
// public static void method01() throws ExceptionExercise {

// int arr[] = new int[5];
// int arr_value = 5;
// int value = arr[arr_value];
// for (int i = 0; i < value; i++) {
// System.out.println(i + value);
// }
// throw new ExceptionExercise("this is the
//ArrayIndexOutBoundsException....");
// }

// public static void main(String args[]) {
// try {
// method01();
// } catch (Exception ExceptionExercise) {
// ExceptionExercise.printStackTrace();
// }
// }
// }

class CustomException extends Exception {
}

class ThrowCustomException {
    public void method0() throws CustomException {
        throw new CustomException();
    }
}

public class Exercise07 {
    ThrowCustomException tce = new ThrowCustomException();
    public static int arr[] = new int[1];
    private static Logger logger = Logger.getLogger("Another example of Exercise07 ");

    public static void method02(Exception e) {
        StringWriter stringWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(stringWriter));
        logger.severe(stringWriter.toString());
    }

    public static void main(String args[]) {
        try {
            int value = arr[5];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException.....!");
            // e.printStackTrace();
            method02(e);
        }
    }
}
