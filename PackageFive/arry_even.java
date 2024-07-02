/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFive;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
//wirte a program in array into 7 integer numbers and find out the even number and print out. 
public class arry_even {
   public static void main(String args[]){
       int arr[] = {0, 1, 2, 3, 4, 5, 6};
       System.out.println("The even number is: ");
       for(int i = 0; i < 7; i++){
           if(arr[i] % 2 == 0){
               System.out.print(arr[i]+" ");
           }
       }
   }
}
