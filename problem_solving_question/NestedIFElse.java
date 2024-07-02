/*  Nested If Else clause in java */
package problem_solving_question;

import java.util.Scanner;

public class NestedIFElse {
    public static void main(String[] args) {
        System.out.println("Example of Nested if-else :");
        int num;
        Scanner sc =new Scanner(System.in);
        num = sc.nextInt();

        if(num <= 0 || num >= 0){
            System.out.print("The number is = "+num+"\n");
            if(num <= 10){
                System.out.print("The number is Possitive number = "+num+"\n");
                if(num <= 0){
                    System.out.print("This number is Negetive Number = "+num+"\n");
                    if(num != 0 || num == 0){
                        System.out.print("This number is not equel to Zero and number equel to Zero = "+num+"\n");
                    }else if(num % 2 == 0){
                        System.out.print("This number is Even number = "+num+"\n");
                    }else{
                        System.out.println("This number is Odd number."+num+"\n");
                    }
                }
            }
        }
        else{
            System.out.print("Pleace the enter the any number does not enter the any characther.");
        }
    }
}
