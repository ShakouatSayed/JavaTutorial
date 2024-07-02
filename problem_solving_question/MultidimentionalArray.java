/*
 * How to create Multidimensional array
 * program in java
 */

package problem_solving_question;

import java.util.Scanner;

public class MultidimentionalArray {
    public static void main(String args[]) {
        int arr[][] = new int[2][3];
        int array[][] = {{1, 2, 4, 5}, {5, 8, 9, 10}};
        Scanner sc = new Scanner(System.in);
        // for(int i = 0; i < 2; i++){
        //     for (int j = 0; j < 3; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
            
        for(int k = 0; k < 2; k++){
            for(int l = 0; l< 4; l++){
                System.out.print(array[k][l]+" ");
            }
            System.out.println(" ");
        }
    }
}
