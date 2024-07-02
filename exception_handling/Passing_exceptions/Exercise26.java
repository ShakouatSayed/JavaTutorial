/*
 * Thinking in Java.
 * Exercise Solution 26:
 * 
 * Exercise 26: Change the file name string in MainException.java to name a
 * file
 * that doesn’t exist. Run the program and note the result.
 */

package exception_handling.Passing_exceptions;

import java.io.FileInputStream;

public class Exercise26 {
    public static void main(String agrs[]) throws Exception {
        String s;
        System.out.println("File doesn't exist. ");
        FileInputStream file = new FileInputStream("null.java");
        file.close();
    }
}