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
public class Array_sum {
    public static void main(String args[]){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Give the size of Array: ");
        int num = sc.nextInt();
        System.out.println("Enter " +num+" numbers: ");
        int arr[] = new int[num];
        int sum= 0;
        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum of the numbers: "+sum);
        
        
        
    }
}
