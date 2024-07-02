package PackageFive;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class arr_ex1 {
    public static void main(String args[]){
        int sum = 0;
        int arr[] = new int[5];
        System.out.println("Enter the array number: ");
        Scanner sc = new Scanner (System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j < arr.length; j++){
            sum = sum + arr[j];
        }
        System.out.println("Sum of the arr element is: "+sum);
        
    }
}
