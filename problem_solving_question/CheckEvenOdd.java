/* How to check Odd and Even Number in java.
 */
package problem_solving_question;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int num = sc.nextInt();

        while (num >= 0 || num <= 0) {
            if (num >= 0) {
                if (num % 2 == 0) {
                    System.out.println("This " + num + " is Even number.");
                    break;
                } else {
                    System.out.println("This " + num + " is Odd.");
                    break;
                }
            }
            else {
                System.out.print("Enter the number is 0 to N number = ");
                num = sc.nextInt();
            }
        }
    }
}
