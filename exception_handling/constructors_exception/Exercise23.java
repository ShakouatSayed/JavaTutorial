/*
 * Thinking in Java.
 * Exercise Solution 23:
 * 
 * Exercise 23: Add a class with a dispose( ) method to the previous exercise. Modify
 * FailingConstructor so that the constructor creates one of these disposable objects as a
 * member object, after which the constructor might throw an exception, after
 * which it creates a
 * second disposable member object. Write code to properly guard against
 * failure, and in
 * main( ) verify that all possible failure situations are covered.
 * 
 */

package exception_handling.constructors_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class NeedClean {
    private static long count = 0;
    private final long id = count++;

    public void dispose() {
        System.out.println("Need Clean: " + id + "Dispose(). ");
    }
}

class Exercise23 {
    private BufferedReader in;
    NeedClean n1;
    NeedClean n2;

    public Exercise23(String f_name) throws Exception {
        n1 = new NeedClean();
        n2 = new NeedClean();
        try {
            in = new BufferedReader(new FileReader(f_name));
        } catch (FileNotFoundException e) {
            System.out.println("File could not found in this time. ");
            throw e;
        } catch (Exception e) {
            try {
                in.close();
            } catch (IOException e1) {
                System.out.println("File close is not Successfully. ");
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

    public static void main(String args[]) {
        try {
            Exercise23 fa = new Exercise23("Exercis23.java");
            try {
                int i = 1;
                String s;
                while ((s = fa.getLine()) != null)
                    ;
            } catch (Exception e) {
                System.out.println("Caught Exection...!");
                e.printStackTrace();
            } finally {
                fa.n1.dispose();
                fa.n2.dispose();
            }
        } catch (Exception e) {
            System.out.println("File is not work ");
        }
    }

}
