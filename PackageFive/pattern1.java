package PackageFive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SHAKOUAT HOSSEN
 */
public class pattern1 {
    public static int pattern(int a){
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= a - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        return a;
    }
    public static void main(String args[]){
        pattern(3);
    }
}
