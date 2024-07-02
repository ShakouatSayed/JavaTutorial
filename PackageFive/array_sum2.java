/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFive;
import java.util.Scanner;
/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class array_sum2 {
    public static void main(String arg[]){
        int arr[][] = new int[10][10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println("The array is: ");
            for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
            System.out.println("The sum is: "+sum);
    }
}
