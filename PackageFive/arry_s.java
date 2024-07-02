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
public class arry_s {
    public static void main(String args[]){
        int arr[] = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum is: "+sum);
        
        
    }
}
