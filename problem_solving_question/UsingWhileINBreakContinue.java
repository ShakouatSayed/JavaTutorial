/* While loop using break and continue
Program in java */
package problem_solving_question;

import java.util.Scanner;

public class UsingWhileINBreakContinue {
    public static void main(String[] args) {
        int i = 0, num;
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Pleace Enter your number = ");
            num = sc.nextInt();
            int randomNumber = (int)Math.random() * 100 ;

            if (num != randomNumber) {
                System.out.println("Enter your guess number = " + num);
                System.out.println("Random Number is = "+randomNumber);
                System.out.println("Your enter the guess number and Random Number are not match. Place enter your another number.");
                continue;
            }
            
            else{
                System.out.println("You win this name.");
                break;
            }
        }
    }
}
