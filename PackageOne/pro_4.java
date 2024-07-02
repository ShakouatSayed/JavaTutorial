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
public class pro_4 {
    public static void main(String args[]){
        //input a number
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(0 < num){
            System.out.println(num+ " is positive number.");
        }else
            System.out.println(num+ " is Negative number.");
    }
}
