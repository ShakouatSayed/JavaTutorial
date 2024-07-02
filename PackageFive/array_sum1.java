/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFive;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class array_sum1 {
   public static void main(String args[]){
       int arr[] = {2, 6, 9, 15, 7, 0, 9, 5};
       int sum = 0;
       for(int i = 0; i < arr.length; i++){
           sum += arr[i];
       }
       System.out.println("Sum: "+sum);
   } 
}
