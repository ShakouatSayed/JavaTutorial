/*
 * Thinking in Java.
 * Exercise Solution 24:
 * 
 * Exercise 24: Add a dispose( ) method to the FailingConstructor class and
 * write
 * code to properly use this class.
 */

package exception_handling.constructors_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FailingConstructor24 {
    private BufferedReader in;

    public FailingConstructor24(String f_name) throws Exception {
        try {
            in = new BufferedReader(new FileReader(f_name));
        } catch (FileNotFoundException e) {
            System.out.println("File could not open " + f_name);
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("File did not close Successfully.");
            }
            throw e;
        } finally {
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(" File read unsuccessfully. ");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() Successfully. ");
        } catch (IOException e) {
            throw new RuntimeException("File dispose is not Successfully. ");
        }
    }
}

public class Exercise24 {
    public static void main(String args[]) {
        try {
            FailingConstructor24 fa = new FailingConstructor24("Exercise24.java");
            try {
                int i = 1;
                String s;
                while ((s = fa.getLine()) != null)
                    fa.dispose();
            } catch (Exception e) {
                System.out.println("Caught Exeception.");
                e.printStackTrace(System.out);
            } finally {
                fa.dispose();
            }
        } catch (Exception e) {
            System.out.println("File does not work Successfully. ");
        }
    }
}