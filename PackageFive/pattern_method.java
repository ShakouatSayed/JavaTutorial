/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackageFive;

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class pattern_method {
    public static void pattern(int a){
        for(int row = 1; row <= a; row++){
            for(int col = 1; col <= a-row; col++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(7);
    }
}
