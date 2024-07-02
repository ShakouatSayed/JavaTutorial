/* Find factorial for given no Program in Java */
package problem_solving_question;

import java.util.Scanner;

public class FindFactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
         long num = 5, result = 1;
        for(int n = 1; n <= num; n++){
            result = result*n;
           
        }
        System.out.println(result);
    }
}
