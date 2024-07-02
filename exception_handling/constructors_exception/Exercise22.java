/*
 * Thinking in Java.
 * Exercise Solution 22:
 * 
 * Exercise 22: Create a class called FailingConstructor with a constructor that
 * might fail partway through the construction process and throw an exception. In main(),
 * write code that properly guards against this failure.
 */

package exception_handling.constructors_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FailingConstructor {
    private BufferedReader in;

    public FailingConstructor(String f_name) throws Exception {
        try {
            in = new BufferedReader(new FileReader(f_name));
        } catch (FileNotFoundException e) {
            System.out.println("File could not found. " + f_name);
            throw e;
        } catch (Exception e) {
            try {
                in.close();

            } catch (IOException e1) {
                System.out.println("File close is not successfully. ");
            }
            throw e;
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("File is not read Successfully. ");

        }
        return s;
    }
}

public class Exercise22 {

    public static void main(String arg[]) {
        try {
            FailingConstructor f = new FailingConstructor("Exercise22.java");
            try {
                int i = 0;
                String s;
                while ((s = f.getLine()) != null)
                    ;
            } catch (Exception e) {
                System.out.println("Caught Exception....!");
                e.printStackTrace();
            }
            System.out.println("Exception is Successfully.");
        } catch (Exception e1) {
            System.out.println("Exception is Caught.");
        }
    }
}
