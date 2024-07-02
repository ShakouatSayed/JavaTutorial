/* . Exception Handling java Program */
package problem_solving_question;

import java.util.Scanner;

public class ExceptionHandeling {
    public static void main(String[] args) {
        int num1 , num2 = 0, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Two Integer Value: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        try {
            result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println("Catch the ne Exception."+e);
        }
        System.out.println(" Example for Exception Handeling ");
    }
}
