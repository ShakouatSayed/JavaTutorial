/*
 * How to create Find Factorial using
 * Recursion Program in java
 */

package problem_solving_question;

import java.util.Scanner;

public class FindFactorial {

    static long factorial(long num) {
        if (num >= 1)
            return (num * factorial(num - 1));
        else
            return 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(factorial(num));
    }
}