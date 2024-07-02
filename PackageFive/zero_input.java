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
public class zero_input {
    public static void main(String arg[]){
        int i = 0;
        Scanner sc = new Scanner(System.in);
       
        while(true){
               System.out.println("Input an integer: ");
                int a = sc.nextInt();
                //System.out.println();
                if(a == 0)
                    break;
                System.out.println("You entered: "+a);
        }
            
    }
}
