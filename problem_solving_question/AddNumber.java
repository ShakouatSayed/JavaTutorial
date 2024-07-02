/* .How to add two number Program in java */
package problem_solving_question;

import java.math.BigInteger;
import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number = ");
        int num1 = sc.nextInt();
        System.out.print("\n"+"Enter the Second number = ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.print("\n"+"Sum of two number = "+sum);

        System.out.print("\n"+"Adding the tow number of Big Integer");

        Scanner s1c = new Scanner(System.in);

        System.out.print("\n"+"Enter the first big integer = ");
        String firstInputNumber = s1c.nextLine();
        BigInteger firstNumber = new BigInteger(firstInputNumber);

        System.out.print("\n"+"Enter the second big integer = ");
        String secondInputNumber = s1c.nextLine();
        BigInteger secondNumber = new BigInteger(secondInputNumber);

        BigInteger result = firstNumber.add(secondNumber);
        System.out.println("\n"+"Add the two big Integer Number = "+result);

    }
}
