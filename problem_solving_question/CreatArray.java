/*
 * How to create array in java.
 */

 
package problem_solving_question;

import java.util.Scanner;

public class CreatArray {
    public static void main(String args[]){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        for(int j = 0; j < 5; j++){
            sum += arr[j];
            System.out.print(arr[j]+" ");
        }
        System.out.println("\n"+sum);
    }
}
