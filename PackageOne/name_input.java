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
public class name_input {
    public static void main(String args[]){
        //input the first name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstName= sc.nextLine();
        //System.out.print();
        System.out.println("Enter the second name: ");
        String secondName= sc.nextLine();
        System.out.print(firstName+" "+secondName);
    }
}
