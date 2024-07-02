/*
 * Thinking in Java.
 * Exercise Solution 27:
 * 
 * Exercise 27: Modify Exercise 3 to convert the exception to a
 * RuntimeException
 */

package exception_handling.ConChe_uncExc;

public class Exercise27 {
    public static void main(String args[]) {
        int arr[] = new int[5];

        // try {
        // int n = arr[10];
        // } catch (Exception e) {
        // throw new RuntimeException(e);
        // }
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            throw new RuntimeException("Caught Exception: " + e);
        }
    }
}