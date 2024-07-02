/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageOne;

import java.util.Scanner;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class pro_3 {
    public static void main(String args[]){
        int sum = 0;
        float avg = 1;
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1, 45};
        int arr[] = new int[20];
        System.out.println("Input the number: ");
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            avg = (float)sum/10;
        }
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+avg);
    }
}





