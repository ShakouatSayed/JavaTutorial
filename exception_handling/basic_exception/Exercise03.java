
/*
 * Thinking in Java.
 * Exercise Solution 3:
 * 
 * Exercise 3: Write code to generate and catch an
 * ArraylndexOutOfBoundsException.
 * 
 */

package exception_handling.basic_exception;

import java.util.ArrayList;

class TestExcept01 extends RuntimeException {
    public TestExcept01() {
    };
}

public class Exercise03 extends TestExcept01 {
    public void arrayIn() {
        // ArrayList<Integer> al = new ArrayList<Integer>();
        // al.add(10);
        // al.add(20);
        // al.add(20);
        // for (int i = 0; i < 10; i++) {
        // System.out.println(al.get(i));
        // }
        int arr[] = new int[5];
        int arr_stor = 10;
        int value = arr[arr_stor];
        System.out.println(value);
        throw new TestExcept01();
    }

    public static void main(String args[]) throws TestExcept01 {
        Exercise03 OB1 = new Exercise03();
        try {
            OB1.arrayIn();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}