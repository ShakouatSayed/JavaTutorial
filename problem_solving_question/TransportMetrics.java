/* How to get transpose of matrix in java
Program */
package problem_solving_question;

import java.util.Scanner;

public class TransportMetrics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j ;

        System.out.println("Enter the Row number: ");
        i = sc.nextInt();
        System.out.println("Enter the Column number: ");
        j = sc.nextInt();

        int arr[][] = new int[i][j];
        int arr1[][] = new int[j][i];

        System.out.println("Enter the row and column value: ");
        for(int row = 0; row < i; row++){
            for(int col = 0; col < j; col++){

                arr[row][col] = sc.nextInt();
                //arr1[row][col] = sc.nextInt();
            }
        }

        System.out.println("Print the matrics: ");
        for(int row = 0; row < i; row++){
            for(int col = 0; col < j; col++){
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }

        System.out.println("transpose matrics: ");
        for(int row = 0; row < i; row++){
            for(int col = 0; col < j; col++){
                //System.out.print(arr[row][col] +" ");
                arr1[col][row] =  arr[row][col];
            }
        }

        System.out.println("Print  the transpose matrics: ");
        for(int row = 0; row < j; row++){
            for(int col = 0; col < i; col++){
                System.out.print(arr1[row][col] +" ");
            }
            System.out.println();
        }

    }
}
