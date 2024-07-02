/* How to add two matrix in java Program */

package problem_solving_question;

import java.util.Scanner;

public class AdditionMatrix {
    public static void main(String[] args) {
        System.out.println("Two matrix addition.");
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int matrix1[][] = new int[num1][num2];
        int matrix2[][] = new int[num1][num2];
        int sum[][] = new int[num1][num2]; 

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
               sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
               System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
