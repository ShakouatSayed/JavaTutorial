/* How to multiply two matrix in java Program  */

package problem_solving_question;

import java.util.Scanner;

/**
 * MatrixMultiply
 */
public class MatrixMultiply {

    public static void main(String[] args) {
        System.out.println("Multiplication of two matrix.");
        // firstly we need how much row and column number
        // we create an object
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, num4, sum = 0;

        System.out.println("Enter the first matrix of row number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the first matrix of col number: ");
        num2 = sc.nextInt();
        System.out.println("Enter the second matrix of row number: ");
        num3 = sc.nextInt();
        System.out.println("Enter the second matrix of col number: ");
        num4 = sc.nextInt();

        int matrix1[][] = new int[num1][num2];
        int matrix2[][] = new int[num3][num4];
        int result[][] = new int[num1][num4];// matrix multiplication rule is num2 == num3

        while (num2 != num3) {
            System.out.println("First matrix column and Second matrix column does not match.");
            System.out.println("Enter the first matrix of row number: ");
            num1 = sc.nextInt();
            System.out.println("Enter the first matrix of col number: ");
            num2 = sc.nextInt();
            System.out.println("Enter the second matrix of row number: ");
            num3 = sc.nextInt();
            System.out.println("Enter the second matrix of col number: ");
            num4 = sc.nextInt();
        }

        System.out.println("Enter the element of first matrix: ");
        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("print of first matrix: ");
        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num2; j++){
                System.out.print(matrix1[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Enter the element of second matrix: ");
        for(int i = 0; i < num3; i++){
            for(int j = 0; j < num4; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("print of second matrix: ");
        for(int i = 0; i < num3; i++){
            for(int j = 0; j < num4; j++){
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num4; j++){
                for(int k = 0; k < num2; k++){
                    sum = sum + matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
                sum = 0;
            }
        }
        
        System.out.println("Print the multiplication matrix.");
        for(int i = 0; i < num1; i++){
            for(int j = 0; j < num4; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}