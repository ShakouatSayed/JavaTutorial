/* While loop using break Program in java
 */
package problem_solving_question;

import java.util.Scanner;

public class UsingBreakINWhileLoop {
    public static void main(String[] args) {
        System.out.println(" The while loop using Break keyword.");
        // while (i <= num) {
        // if (num != 0) {
        // result = num * i;
        // System.out.println("Multiplication = " + result);
        // if (result <= 50) {
        // i++;
        // break;
        // }
        // }
        // }
        int i = 0;
        int num, result = 50;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        num = sc.nextInt();
        while (i <= num) {
            System.out.println("You Entered " + num +" and "+ i + " value add is = " + (num+i));
            i++;
            if (num >= 5) {
                System.out.println("When "+ num + " greter then or equel to 5, then will be break. ");
                break;
            }
        }
    }
}
