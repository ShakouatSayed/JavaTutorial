/* How to complete 2 string in Java program */
package problem_solving_question;

import java.util.Scanner;

public class CompleateTwoString {
    public static void main(String[] args) {
        System.out.println("Print the complete the two String.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first String = ");
        String str = sc.nextLine();
        System.out.print("The first String is = "+str+"\n");
        int strLenght = str.length();
        System.out.println("String length is = "+strLenght);

        System.out.println("\n");
        System.out.print("Enter the second String = ");
        String str1 = sc.nextLine();
        System.out.print("The second String is = "+str1+"\n");
        int str1Lenght = str1.length();
        System.out.println("String length is = "+str1Lenght);

        System.out.println("\n");
        if(strLenght >= str1Lenght){
            System.out.println("The First String greter then is Second String.");
            System.out.println(str.length() + " > " +str1.length());
        }
        else if(strLenght <= str1Lenght){
            System.out.println("The First String Less then is Secoind String.");
            System.out.println(str.length() + " < " +str1.length()+"\n");
        }  
        else
            System.out.println("This string are equel.");
    }
}
