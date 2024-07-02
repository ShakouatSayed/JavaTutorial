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
public class problem_2 {
    public static void main(String args[]){
    //string first user input the 
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first String: ");
        String s1 = sc.nextLine();
        System.out.println("Input the Second String: ");
        String s2 = sc.nextLine();
        if(s1 == null ? s2 == null : s1.equals(s2)){
            System.out.println("Match.");
        }else{
            System.out.println("Not Match.");
        }
    }
}
