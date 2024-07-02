/* If Else clause in java- Program 2
 */
package problem_solving_question;

import java.util.Scanner;

public class ExampleOFIFElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age = ");
        int age = sc.nextInt();

        while (age >= 18 || age <= 18) {
            if (age >= 18) {
                System.out.print("You enter the Election Center and you get the vote" + "\n");
                System.out.print("Pleace Enter the vote."+"\n\n");
                break;
            } else {
                System.out.print(
                        "Your age is under 18 and you does not enter the Election Center and you can not get the vote"
                                + "\n");
                System.out.print("Pleace try the next year." + "\n\n");
                System.out.print("Enter the age = ");
                age = sc.nextInt();
            }
        }
    }
}
