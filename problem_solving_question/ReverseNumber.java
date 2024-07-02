/* Print Reverse number in java program
 */
package problem_solving_question;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Reverse the any number.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number = ");
        int num = sc.nextInt(), reminder, reverse = 0;

        while (num != 0) {
            reminder = num % 10;
            reverse = reverse * 10;
            reverse = reverse + reminder;
            num /= 10;
        }
        
        System.out.println("The number is = " + reverse);
    }
}
